package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Controllers.LoginController;
import Helpers.RemoveFile;
import Helpers.UploadVideo;


@MultipartConfig
@WebServlet("/Media")
public class Media extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Media() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		out.print(LoginController.sesion.getAttribute("foto"));
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		
		
		
		
	
		
		if ( !(LoginController.sesion.getAttribute("foto").equals("unchecked") ))RemoveFile.Remove(LoginController.UserSession); 		
		out.println(	UploadVideo.Uploadd(request.getPart("fileCambiarFoto"))	);
		
		
		
		
	}

}














