package Helpers;

import java.io.File;

public class FileCheck {
	
	
	public static String Check(String user) {
		
		File fileJPG = new File("http://localhost:8127/Registrouru/Fotos/"+user+".jpg");
		File filePNG = new File("http://localhost:8127/Registrouru/Fotos/"+user+".png");
		
		if(		fileJPG.exists()		)return user+".jpg";		
		else if(	filePNG.exists()	)return user+".jpg";
		else {return "unchecked";}
		
		
	}
	
	
	
	
	
	
	

}
