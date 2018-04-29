package jdbc;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 常用的数据库连接池有DBCP，C3P0
 */
public class JdbcPool {
    public static String driverClassName = "com.mysql.jdbc.Driver";
    public static String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/db_A";
    public static String jdbcUser = "root";
    public static String jdbcPasswd = "271828lhy";
    public static String sql = "SELECT * FROM USER WHERE id=?";
    public static String row = "";

    public static void main(String[] args) throws SQLException {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(jdbcUrl);
        dataSource.setUsername(jdbcUser);
        dataSource.setPassword(jdbcPasswd);
        dataSource.setInitialSize(10);
        dataSource.setMaxActive(20);
        dataSource.setMinIdle(2);
        Connection con = dataSource.getConnection();
        System.out.println(con+" !");
    }
}
