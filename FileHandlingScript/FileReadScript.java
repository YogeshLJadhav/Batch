package FileHandlingScript;

import java.io.FileReader;
import java.io.IOException;

public class FileReadScript {
public static void main(String[] args) throws IOException
{
	FileReader fr=new FileReader("d:// NewFile.txt");
	try
	{
	int i;
	while((i=fr.read())!=-1)
	{
	System.out.println((char)i);
	}
	}
	finally
	{


	fr.close();
	}
}
}
