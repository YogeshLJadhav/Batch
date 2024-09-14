package FileHandlingScript;

import java.io.File;
import java.io.IOException;

public class Create_File {

	public static void main(String[] args) throws IOException {
		File f=new File("d://NewFile.txt");
		f.createNewFile();
		if(f.exists())
		{
			System.out.println("file is created");
			System.out.println("file name : "+f.getName());
			System.out.println("file location:"+f.getAbsolutePath());
			System.out.println("File redable:"+f.canRead());
			System.out.println("file writeble :"+f.canWrite());
			System.out.println("'file size :"+f.length());
			//System.out.println("file Delete:"+f.delete());
		}

	}

}
