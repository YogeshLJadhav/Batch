package FileHandlingScript;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_WriteScript {

	public static void main(String[] args) throws IOException {
		//create file
		File f=new File("d://NewFile.txt");
		f.createNewFile();
		System.out.println("the file is created");

		//writing data in file

		FileWriter fw=new FileWriter("d://NewFile.txt");
		try
		{
		fw.write("Hellow world to everyone");
		}
		finally
		{
			fw.close();
		}
	}

}
