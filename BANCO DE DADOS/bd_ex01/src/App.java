import java.sql.*;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        String url = "jdbc: postgresql://localhost/";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "feevale");
        props.setProperty("ssl", "false");
        try {
            Connection conexao = DriverManager.getConnection (url, props);
            Statement stmt = conexao.createStatement();
            stmt.execute ("SET SERACH_PATH TO RH");
            ResultSet rs = stmt.executeQuery("select * from dept");
            while(rs.next())
                System.out.println(rs.getString("nome"));        
        }   
        catch (Exception e) {
            System.out.println(e);
        }     
    }
}
