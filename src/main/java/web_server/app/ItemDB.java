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
    private static String edit;
    private ResultSet resultSet;

    private List<String> res = new ArrayList<>();

    public List<String> getResult() {
        return res;
    }
    Connection connection;
    Statement statement;

    public ItemDB()
    {
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/web-server", "postgres", "!Hund111");
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }






    public void add(HttpRequest request) {
        add = "insert into item(title, price) values ('" + request.getTitle() + "', " + request.getPrice() + ");";
        try {
            statement.executeUpdate(add);
            logger.info("\nТовар успешо добавлен в БД\n");
        } catch (SQLException e) {
            logger.debug("Проверьте соединение с БД", e);
        }
    }



    public void delete(HttpRequest request) {
        delete = "delete from item where id = " + request.getId() + ";";
        try {
            statement.executeUpdate(delete);
            logger.info("\nТовар успешо удален из БД\n");
        } catch (SQLException e) {
            logger.debug("Проверьте соединение с БД", e);
        }
    }


    public List<String>  showAllItems() {
        String result= null;
        res.clear();
               try {
            resultSet = statement.executeQuery("select * from item;");
            while (resultSet.next()) {
                result = resultSet.getString("id") + " " + resultSet.getString("title") + " " + resultSet.getString("price");
                logger.info(result);
                res.add(result);
            }
        } catch (SQLException e) {
                   logger.debug("Проверьте соединение с БД", e);
        }
        return res;
    }



    public String showItem(Long id){
        String result = null;
        try {
            resultSet = statement.executeQuery("select * from item where id = " + id + ";");
            while (resultSet.next()) {
                result = resultSet.getString("id") + " " + resultSet.getString("title") + " " + resultSet.getString("price");
            }
        } catch (SQLException e) {
            logger.debug("Проверьте соединение с БД", e);
        }
        if(result == null){
            result = "Товара с таким id не существует";
            logger.info(result);
        }
        return result;
    }




    public void editItem(HttpRequest request) {
        edit = "update item set title = '" + request.getTitle() + "', price = " + request.getPrice() + " where id = " + request.getId() + ";";
        try {
           statement.executeUpdate(edit);
        } catch (SQLException e) {
            logger.debug("Проверьте соединение с БД", e);
        }
    }



}
