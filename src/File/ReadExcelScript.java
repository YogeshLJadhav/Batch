package File;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelScript {

	public static void main(String[] args) throws IOException
	{
		String filepath="C:\\Users\\Yogesh\\Downloads\\EmployeeData.xlxs";                             //location
		FileInputStream fileinputstream =new FileInputStream(filepath);    //class reading
		XSSFWorkbook workbook=new XSSFWorkbook(filepath);                  //workbook available location
		XSSFSheet sheet=workbook.getSheetAt(0);                            //get sheet with index value


		//using while loop iterator class

		Iterator rowsitr =sheet.iterator();
		while(rowsitr.hasNext())
		{
			XSSFRow row=(XSSFRow)rowsitr.next();

			Iterator cellitr=row.iterator();
			while(cellitr.hasNext())
			{
				XSSFCell cell=(XSSFCell)cellitr.next();

				switch (cell.getCellType())
				{
				case STRING:System.out.print(cell.getStringCellValue());

					break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());

				break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());

				break;


				}
				System.out.println(" | ");
			}
			System.out.println();
		}

	}

}
