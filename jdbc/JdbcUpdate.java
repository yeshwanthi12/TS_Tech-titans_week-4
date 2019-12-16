package jdbc;

	import java.sql.*;  
	class JdbcUpdate{  
	public static void main(String args[]){  
	try{  
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/yesh","root","1234");   

	PreparedStatement stmt=con.prepareStatement("update product set pname=? where pname=?");  
	stmt.setString(1,"smart tv"); 
	stmt.setString(2,"sart");
 
	
	  
	int i=stmt.executeUpdate();  
	System.out.println(i+" records updated"); 
	ResultSet obj=stmt.executeQuery("select *from product");
	while(obj.next())
	{
		System.out.println(obj.getInt(1)+" "+obj.getString(2));
	}
	  
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	}  
	}  


