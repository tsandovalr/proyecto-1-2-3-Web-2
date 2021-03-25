package Helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DownloadVideo {
	
	@SuppressWarnings("resource")
	public static String Upload(String nombre, String path) {
		
			File lol = new File("video");
			lol.mkdirs();
			String directorio = lol.getAbsolutePath();	
			System.out.println(directorio+"\\"+nombre);
			
			byte[]bytes = new byte[1024];
			FileInputStream copiada = null;
			FileOutputStream pegada = null;
			
			try {
			
				copiada = new FileInputStream(path);
				
				pegada = new FileOutputStream(directorio+"\\"+nombre);
				
				int c=0;
				
				while((c = copiada.read(bytes))!= -1) {
					
					pegada.write(bytes, 0, c);
						
				}
				
				pegada.close();
			
			} catch (IOException e) {			
			e.printStackTrace();
			}
			
			
			
			return directorio+"\\"+nombre;
		
		
	}
	
	

}
