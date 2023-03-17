package RetrieveImage;

import java.sql.*;

class RetrievePrepared{
	public static void main(String args[]){
		try{
			// db parameters
			String url       = "jdbc:mysql://localhost:3306/fsae01";
			String user      = "root";
			String password  = "1234";

			// Class.forName("com.mysql.cj.jdbc.Driver");

			// create a connection to the database
			Connection con = DriverManager.getConnection(url, user, password);

			PreparedStatement stmt=con.prepareStatement("select * from ogrenciler where id = ? and sinav_notu = ?");

			stmt.setInt(1,121);
			stmt.setInt(2,85);


			ResultSet rs=stmt.executeQuery();


			while(rs.next()){
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}

			con.close();

		}catch(Exception e){ System.out.println(e);}

	}
}