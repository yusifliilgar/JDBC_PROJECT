import java.sql.*;

public class TestConnection {


    public static void main(String[] args)  {



    //  3.84.26.130
        // 1521
        // xe   SID
        // user hr
        // password hr

        // jdbc url AKA connection String
        // syntax
        // jdbc vendorName: driverType @YourHost : Port  :SID

        // jdbc :  oracle : thin  @3.84.26.130:1521:XE


        String url = "jdbc:oracle:thin:@3.84.26.130:1521:XE";


        try {
            Connection con = DriverManager.getConnection(url, "hr", "hr");


            Statement stmnt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);




         //   rs.next();

          //  System.out.println(rs.getString("REGION_NAME"));




            System.out.println("CONNECTION SUCCESSFUL");
        }catch (SQLException e){
            System.out.println("CONNECTION HAS FAILED" + e.getMessage());
        }

    }




}
