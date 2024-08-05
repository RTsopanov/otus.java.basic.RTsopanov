package web_server.app;

import web_server.HttpRequest;
import org.apache.logging.log4j.*;

import java.sql.*;

public class ItemDB {
    private static final Logger logger = LogManager.getLogger(Item.class.getName());
    private static String add;
    private static String delete;


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


    public void showAllItems() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/web-server", "postgres", "!Hund111");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from item;");
            while (resultSet.next()) {
                logger.info(resultSet.getString("title") + " " + resultSet.getString("price"));
            }
        } catch (SQLException e) {
            logger.error(e);
        }
    }
}
