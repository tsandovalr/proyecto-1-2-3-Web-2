package Controllers;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Helpers.Auth;
import Helpers.ConnectionDB;



public class Infocontroller {
	
	
	
	
static public Connection conexionDB() {
		
		
	String url = "postgres://yvqxmfghytbxhl:a1cdac3de6683c9e119ab40b05a9a3bd806508d7313333cb062833350a22895d@ec2-52-7-115-250.compute-1.amazonaws.com:5432/d4v2bsj1os438e";
	String passDB = "a1cdac3de6683c9e119ab40b05a9a3bd806508d7313333cb062833350a22895d";
	String userDB = "yvqxmfghytbxhl";
	
		
		
		
		
		
		Connection conn = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, userDB, passDB);
			System.out.println("conexion con base de datos exitosa...");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		return conn;
		
	}
	
	
	public static void Info (HttpServletRequest request, HttpServletResponse res, String username) throws SQLException, ServletException, IOException {
		
		
				Connection conn = conexionDB();
				Statement stmt = conn.createStatement ();
				

					
				
				ResultSet result = stmt.executeQuery("select country,city,gender,tlf from login where username='"+username+"'");
					
				while(result.next()) {

					result.getString	("username");
				    result.getString     ("country");
				    result.getString      ("city");
				    result.getString      ("gender");
				    result.getString      ("tlf");

				    // etc.
				}

				
				Cookie cookie = new Cookie("username",result.getString("username"));
				Cookie countrycookie = new Cookie("country",result.getString("country"));
				Cookie citycookie = new Cookie("city",result.getString("city"));
				Cookie gendercookie = new Cookie("gender", result.getString("gender"));
				Cookie tlfcookie = new Cookie("tlf", result.getString("tlf"));
				
				res.setContentType("text/html");
				
				res.addCookie(cookie);
				res.addCookie(countrycookie);
				res.addCookie(citycookie);
				res.addCookie(gendercookie);
				res.addCookie(tlfcookie);
				
				RequestDispatcher req=request.getRequestDispatcher("Login");
				req.forward(request,res);
				
			
				
			
				
		
		
		
	}}



	
	
	
	
	
	
	


