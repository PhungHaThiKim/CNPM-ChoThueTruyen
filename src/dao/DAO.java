
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author phung
 */
public class DAO {
    private Connection connection;

    public DAO() {
        if (this.connection == null) {
            String dbUrl = "jdbc:mysql://localhost:3306/thuetruyen"+"?useUnicode=true&characterEncoding=UTF-8";
            String dbClass = "com.mysql.jdbc.Driver";

            try {
                Class.forName(dbClass);
                this.connection = DriverManager.getConnection(dbUrl, "root", "");
                System.out.println("Db Connected: " + this.connection);
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }
    }

    public DAO(Connection connection) {
        this.connection = connection;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
}
