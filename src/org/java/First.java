package org.java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Properties;

public class First {
	public static void main(String[] args) throws IOException {
	     Properties s = new Properties();
	     
	    
		 FileInputStream s1 = new FileInputStream("C://Users//P.Santhosh Kumar//eclipse-workspace//New_Try//src//org//java//First file");
	     s.load(s1);
	     LinkedHashMap<Object,Object> n = new LinkedHashMap<>(s);
	     System.out.println(n);
	     System.out.println(s.get("1.pongal"));
	     s.setProperty("1.pongal", "25");
	       
	     FileOutputStream e = new FileOutputStream("C://Users//P.Santhosh Kumar//eclipse-workspace//New_Try//src//org//java//First file");
	     s.store(e, "Updated Price");
	     
	     
	}
	

}
