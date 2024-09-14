package File;



import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException
	{
		XSSFWorkbook workbook=new XSSFWorkbook();        //workbook creation
		XSSFSheet sheet=workbook.createSheet("EmpPost");  //sheet create
		Object emp[][]= { {"Emp id","Emp Name","Post"},
				          {101,"A","Manual Tester"},
				          {102,"B","Devops"},      //data define
				          {103,"C","Software"},
				          {104,"D","Team Lead"},
				          {105,"E","Account"},
				          {106,"'F","Project Managr"},
				          {107,"G","Java Developer"}};

		 int rows=emp.length;                                   //row and column length
		 int columns=emp[0].length;
		 System.out.println("no of rows :"+rows+" no of columns : "+columns);

		 for(int r=0; r<rows;r++)
		 {
			 XSSFRow row=sheet.createRow(r);
			 for(int c=0;c<columns;c++)
			 {
				 XSSFCell cell=row.createCell(c);

				 Object value=emp[r][c];

				 if(value instanceof String)
					 cell.setCellValue((String)value);

				 if(value instanceof Integer)
					 cell.setCellValue((Integer)value);

				 if(value instanceof Boolean)
					 cell.setCellValue((Boolean)value);



			 }

		 }
		 String filepath ="d://EmployeeData,xlsx";
		 FileOutputStream outputstream=new FileOutputStream(filepath);

		 workbook.write(outputstream);

		 outputstream.close();
		 System.out.println("The excel file executed");

	}

}
