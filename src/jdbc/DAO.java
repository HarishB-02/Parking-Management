package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import details.Details;

public class DAO{
    public void insertValues(Details details){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","user","password");
            String query="insert into details values(?,?,?,?,?,?,?)";

            PreparedStatement pstmt = con.prepareStatement(query);

            pstmt.setString(1,details.getId().toString());
            pstmt.setString(2,details.getVehicleNumber());
            pstmt.setString(3,details.getVehicleType());
            pstmt.setString(4,details.getEntryTime().toString());
            pstmt.setString(5,details.getPhoneNumber());
            pstmt.setString(6,details.getTokenNumber());
            pstmt.setString(7,Float.toString(details.getPrice()));

            pstmt.executeUpdate();
            con.close();
            System.out.println("Success!");
        }
        catch(Exception e){
            System.out.println("---------->  "+e);
        }
    }
    public void deleteValues(String tokenNumber){
        try{

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","user","password");
            Statement  st = con.createStatement();
            String query="delete table emp1 where tokennumber='"+tokenNumber+"';";
            int result=st.executeUpdate(query);
            con.close();
            System.out.println("Success!    "+result);
        }
        catch(Exception e){
            System.out.println("---------->  "+e);
        }

    }
    public boolean fetchTable(String tokenNumber){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","user","password");
            Statement  st=con.createStatement();

            String query="select * from details where tokennumber='"+tokenNumber+"'";

            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                System.out.println(rs.getString("tokennumber"));
                if(rs.getString("tokennumber").equals(tokenNumber)){
                    return true;
                }
            }
            System.out.println("Success!");
            return false;
        }
        catch(Exception e){
            System.out.println("---------->  "+e);
        }
        return false;
    }
}

