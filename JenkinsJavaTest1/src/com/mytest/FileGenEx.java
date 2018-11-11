package com.mytest;

import java.io.FileWriter;
import java.util.Date;

public class FileGenEx {

	public static void main(String[] args) {
		
		
		  try{    
	           FileWriter fw=new FileWriter("E:/TempJenkins/File1.txt");    
	           
	           fw.write("File modified at 4:51");
	           fw.write("\n");
	           fw.write("Welcome to Jenkins-Java Test example");
	           fw.write("\n");
	           fw.write("Current time :"+new Date());
	           
	           fw.flush();
	           fw.close();    
	           fw =null;
	           
	          }catch(Exception e){System.out.println(e);}
		  
	          System.out.println("File writing Done!");    
	          
	          

	}

}
