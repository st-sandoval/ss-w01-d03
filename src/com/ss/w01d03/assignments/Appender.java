package com.ss.w01d03.assignments;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Appender {

	public void appendToFile (String filePath, String texto) throws IOException {
		System.out.println("filePath: " + filePath);
		System.out.println("texto: " + texto);
		
		
		
		try (BufferedWriter output = new BufferedWriter(new FileWriter(filePath, true));){
			output.append(texto);
			

			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}

