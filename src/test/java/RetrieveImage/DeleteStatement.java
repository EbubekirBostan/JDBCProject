package RetrieveImage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteStatement {

	public DeleteStatement() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{			

			// db parameters
			String url       = "jdbc:mysql://localhost:3306/fsae01";
			String user      = "root";
			String password  = "1234";

			// Class.forName("com.mysql.cj.jdbc.Driver");

			// create a connection to the database
			Connection con = DriverManager.getConnection(url, user, password);	

			Statement stmt= con.createStatement();

			/*String table = "create table personel33 (id int , isim varchar(50) , maas int(4));";

			int create=stmt.executeUpdate(table);

			System.out.println(create);*/

			String insert = "insert into personel33(id,isim,maas)"+"values(120,'Ebubekir',2000);";

			int ekle = stmt.executeUpdate(insert);

			System.out.println(ekle);




/*	String i = " 'Yavuz Bal' ";

			int result=stmt.executeUpdate("delete from ogrenciler where isim ="+i);



			// int result=stmt.executeUpdate("update ogrenciler set isim = 'Martin Parr' where id = 120");

			System.out.println(result+" records affected");			*/

			con.close();  
		}catch(SQLException e){ System.out.println(e);}

	}

}