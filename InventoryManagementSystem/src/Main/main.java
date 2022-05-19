package Main;

import com.sun.jdi.connect.spi.Connection;

public class main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("", "", "");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
