package web_server.app;

import web_server.HttpRequest;
import org.apache.logging.log4j.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDB {
    private static final Logger logger = LogManager.getLogger(Item.class.getName());
    private static String add;
    private static String delete;
    private String resul;
    private List<String> res = new ArrayList<>();

    public List<String> getResult() {
        return res;
    }

    public String getResul() {
        return resul;
    }



    public void add(HttpRequest request) {
        add = "insert into item(title, price) values ('" + request.getTitle() + "', " + request.getPrice() + ");";
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/web-server", "postgres", "!Hund111");
            Statement statement = connection.createStatement();
            statement.executeUpdate(add);
            logger.info("\nТовар успешо добавлен в БД\n");
        } catch (SQLException e) {
            logger.error(e);
        }
    }



    public void delete(HttpRequest request) {
        delete = "delete from item where id = " + request.getId() + ";";
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/web-server", "postgres", "!Hund111");
            Statement statement = connection.createStatement();
            statement.executeUpdate(delete);
            logger.info("\nТовар успешо удален из БД\n");
        } catch (SQLException e) {
            logger.error(e);
        }
    }


    public List<String>  showAllItems() {
        ResultSet resultSet;
               try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/web-server", "postgres", "!Hund111");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from item;");
            while (resultSet.next()) {
                resul = resultSet.getString("id") + " " + resultSet.getString("title") + " " + resultSet.getString("price");
                logger.info(resul);
                res.add(resul);

            }
        } catch (SQLException e) {
            logger.error(e);
        }
        System.out.println(res);
        return res;
    }



    public String showItem(Long id){
        ResultSet resultSet;
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/web-server", "postgres", "!Hund111");
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from item where id = " + id + ";");
            while (resultSet.next()) {
                resul = resultSet.getString("id") + " " + resultSet.getString("title") + " " + resultSet.getString("price");
            }
        } catch (SQLException e) {
            logger.error(e);
        }
        if(resul == null){
            resul = "Товара с таким id не существует";
            logger.info(resul);
        }
        return resul;
    }
}
