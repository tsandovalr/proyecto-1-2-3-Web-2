package Helpers;

import java.io.File;



public class ListaDeVideos {
	
	
	public static String Retornar() {
		
		File folder = new File("http://localhost:8127/Registrouru/videos");
		String respuesta = folder.getAbsolutePath();
		System.out.println("respuesta: "+respuesta);
		
		return respuesta;
		
		
	
	
	}
	
	
	
	
	
	
	
	
	

}
