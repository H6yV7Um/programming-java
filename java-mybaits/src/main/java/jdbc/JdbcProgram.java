package jdbc;

import java.sql.*;

/**
 * Created by yancy on 2018/4/29.
 */
public class JdbcProgram implements Runnable {


    public static String jdbcUrl = "jdbc:mysql://127.0.0.1:3306/db_A";
    public static String jdbcUser = "root";
    public static String jdbcPasswd = "271828lhy";
    public static String sql = "SELECT * FROM USER WHERE id=?";
    public static String row = "";

    public void run() {
        try {
            //1、加载驱动  mysql的驱动："com.mysql.jdbc.Driver"
            Class.forName("com.mysql.jdbc.Driver");

            //2、通过DriverManage获取数据库连接，connection物理连接的抽象
            Connection con = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPasswd);


            //3、获取执行SQL的Statement对象
//            Statement statement = con.createStatement();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, 1);

            //4、使用Statement对象执行SQL.
            /**
             * 1.execute() 可执行任何SQL语句，返回布尔值
             * 2.executeQuery() 执行select语句，返回ResultSet
             * 3.executeUpdate() 执行DML语句，返回一个整数，代表受影响的行数
             * */
//            ResultSet resultSet = statement.executeQuery(sql);
            ResultSet resultSet = statement.executeQuery();

            //5、处理结果集ResultSet.
            // ResultSet可以通过getXXX(列索引|列名)方法，获取记录指针
            //记录指针指向特定的行，特定列的值。使用next()方法移动指针
            while (resultSet.next()) {
                row = resultSet.getInt(1)
                        + " " + resultSet.getString(2)
                        + " " + resultSet.getString(3)
                        + " " + resultSet.getString(4)
                        + " " + resultSet.getString(5);
                System.out.println(row);
            }


            //6、关闭 ResultSet -> Statement -> Connection
            resultSet.close();
            statement.close();
            con.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        JdbcProgram jdbcProgram = new JdbcProgram();
//        for (int i = 0; i < 3000; i++) {
//            String name = "新线程" + i;
//            new Thread(jdbcProgram, name).start();
//        }
        jdbcProgram.run();
    }
}
