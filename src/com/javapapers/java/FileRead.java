package com.javapapers.java;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
class FileRead 
{
   public static void main(String args[]) throws IOException
	{
    	  
    	  BufferedReader buf = null;
			String output = "";
			File file = new File("C:\\Lucids_Workspace\\Java_OO_Concepts\\src\\com\\javapapers\\java\\prodnam.txt");
			List<String> tempList = null;
			
			
			try{
				if(file.exists()) {
					
					BufferedReader bufRdr  = new BufferedReader(
						    new InputStreamReader(new FileInputStream(file),"UTF-16"));
					
					while((output = bufRdr.readLine()) != null){
						//tempList.add(output)
						System.out.println(output);
					}
					//Collections.sort(tempList);
				}else {
					System.out.println( "Requested file does not exist in path ::"+file.getAbsolutePath());
				}
			}catch(IOException io) {
				System.out.println( "Exception occured while reading the text file");
			}finally{
				buf.close();
			}
			
	}
}

