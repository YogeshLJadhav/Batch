package practice_Scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Throws_key {

	void FileRead() throws FileNotFoundException           //scenorio --file is existing -in real file is not present
	{                                                      // Throws keyword is used instance of try & catch (exception) handling)
		FileInputStream fr = new FileInputStream("d:/Abc.text");
		System.out.println(" abc file not found");
	}                                    // scenerio file do not exit at said location
                                      	//exception occured in real after execution---using try and catch

	void FileWrite() throws FileNotFoundException
	{
		FileInputStream fw = new FileInputStream("d:/Abc.text");   //scenerio file exist in real--using Throws keywords--decleration
		System.out.println(" new file not found");
	}

	public static void main(String[] args) throws FileNotFoundException {

		Throws_key x= new Throws_key();
		x.FileWrite();
		x.FileRead();

		System.out.println(" rest of program");


	}

}

