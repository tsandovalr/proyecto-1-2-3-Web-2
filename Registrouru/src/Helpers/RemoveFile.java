package Helpers;

import java.io.File;

public class RemoveFile {
	
	public static void Remove(String user) {
		
		
		File fotoJPG = new File("http://localhost:8127/Registrouru/Fotos/"+user+".jpg");//modificar esto antes de montar en heroku, a solo archivos/...
		
		
		if(fotoJPG.exists()) {fotoJPG.delete();}
		
		
		
	}
	

}
