import java.sql.*;

public class Jdbc_01 {

    public static void main(String[] args) {

        try {
            String host ="jdbc:mysql://localhost:3306/fsae01";
            String user= "root";
            String password= "1234";

            Connection con = DriverManager.getConnection(host, user, password);
            java.sql.Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = st.executeQuery("select * from ogrenciler");

            rs.absolute(1);
            System.out.println("rs.getInt(1)+\" \"+rs.getString(2) = "
                    + rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));



          /*while (rs.next()) {
               int id = rs.getInt("id");
               String ogrenciName = rs.getString("isim");
               String adres = rs.getString("adres");
               int sinavNotu = rs.getInt("sinav_notu");
               System.out.println("id : " + id + " " + "ogrenci Name : " + ogrenciName + " "
                       + "adres : " + adres + " " + "sinavNotu : " + sinavNotu);
           }

           /*
             while (rs.next()) {
               int id = rs.getInt(1);
               String ogrenciName = rs.getString(2);
               String adres = rs.getString(3);
               int sinavNotu = rs.getInt(4);
               System.out.println("id : " + id + " " + "ogrenci Name : " + ogrenciName + " "
                       + "adres : " + adres + " " + "sinavNotu : " + sinavNotu);
           }
            */




                con.close();


        }catch(SQLException e){
            e.printStackTrace();
        }


    }

}
