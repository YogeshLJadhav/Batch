package FileHandlingScript;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileCreation {

	public static void main(String[] args) throws FileNotFoundException
	{
		XSSFWorkbook wb=new XSSFWorkbook();                         //workbook created

		FileOutputStream s=new FileOutputStream("d://StudentData.xlsx"); //location &extension provide


        XSSFSheet ss=wb.creatSheet("StName");     //sheet creat
        wb.write(s);                                        //row and column activated
        System.out.println("the excel is created");

	}

}
