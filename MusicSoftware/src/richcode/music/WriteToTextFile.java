package richcode.music;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToTextFile{
	
	
	public static void writeToFile(String text, File outputPath){
		try {
			//make FileWriter instance with the target document and boolean append
			FileWriter fileWriter = new FileWriter(outputPath, false);
			fileWriter.write(text);
			fileWriter.close();
			System.out.println("Text written to "+outputPath.getName());
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static File createLPFile(String directoryPath) {
		
		//Convert the String pathname to File instance
		File f = new File(directoryPath);
		//Create file
		try{
			if(!f.exists()){
				f.createNewFile();
				System.out.println("File "+f.getName()+" was created.");
			}
			else{
				System.out.println("File "+f.getName()+" already exists.");
			}
		}			
		catch (Exception e){
			e.printStackTrace();
		}
		return f;
	}
	
}

