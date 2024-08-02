package web_server.app;

import web_server.HttpRequest;
import org.apache.logging.log4j.*;
import java.sql.*;

public class ItemDB  {
private static final Logger logger =  LogManager.getLogger(Item.class.getName());
private static  String add;





    public void add(HttpRequest request) {
//        add = "insert into item(title, price) values (" + request.getTitle() + ", " + request.getPrice() + ");";
        add = "insert into item(title, price) values (Sss, 30 );";
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5433/web-server", "postgres", "!Hund111");
            Statement statement = connection.createStatement();
            statement.executeUpdate(add);
            logger.info("\nПользователь успешо добавлен в БД\n");
        } catch (SQLException e) {
            logger.error(e);
        }


    }
}
