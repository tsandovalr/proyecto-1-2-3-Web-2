package Helpers;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.Part;

import Controllers.LoginController;

public class UploadVideo {	
	
public static String Upload(Part archivo, String nombre) throws IOException {
		
	
		
	File folder = new File("http://localhost:8127/Registrouru/videos");
	if(		!(folder.mkdir())		)folder.mkdir();
		
		
		String directorioSubida = folder.getAbsolutePath();	//provee el directorio donde se copiara el archivo
		
		
		InputStream in = archivo.getInputStream();
		FileOutputStream out = new FileOutputStream(directorioSubida+"\\"+nombre+"(SUBIDO POR "+LoginController.UserSession+").mp4");
		
		
		int read = 0;
		
		final byte[]bytes = new byte[1024];
		
		while((read=in.read(bytes))!=-1) {
			out.write(bytes, 0 , read);
		}
		
		out.close();
		
		
		return "http://localhost:8127/Registrouru/videos/"+nombre;
	//return directorioSubida+"\\"+name;
		
	
		
	}


public static String Uploadd(Part archivo) throws IOException {
	
	
	File folder = new File("http://localhost:8127/Registrouru/Fotos");
	if(		!(folder.mkdir())		)folder.mkdir();
	
	
	String directorioSubida = folder.getAbsolutePath();	//aqui se va a ubicar el archivo que subamos
	
	
	
	
	String nameFile = LoginController.UserSession+".jpg";
	System.out.println("llega aqui?");
	
	InputStream in = archivo.getInputStream();
	FileOutputStream out = new FileOutputStream(directorioSubida+"\\"+nameFile);
	
	LoginController.sesion.setAttribute("foto", nameFile);
	
	int read = 0;
	
	final byte[]bytes = new byte[1024];
	
	while((read=in.read(bytes))!=-1) {
		out.write(bytes, 0 , read);
	}
	
	out.close();
	
	
	return "http://localhost:8127/Registrouru/Fotos/"+nameFile;
//return directorioSubida+"\\"+name;
}
	
	

}
