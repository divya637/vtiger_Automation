package com.generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib implements Auto_constant {
	public static String readData(String path,String sheet_name, int row ,int cell) throws IOException
	{  FileInputStream fis=new FileInputStream(Excel_path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	  String value=wb.getSheet(sheet_name).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
/* public static void writeData(String path,String sheet_Name,String value,int row,int cell) throws IOException
  {    
	  FileOutputStream fos=new FileOutputStream(Excel_path);
	  XSSFWorkbook wb=new XSSFWorkbook();
	   XSSFSheet sheet=wb.createSheet("write_Sheet_name");
	   for(int i=0;i<=3;i++)
	   {
		   XSSFRow row1=sheet.createRow(row);
		   for(int j=0;j<=i;j++)
		   {
		  
			   row1.createCell(cell).setCellValue(value);
		   }
		   wb.write(fos);
		   fos.close();
	   
	   }
	  System.out.println("write Successfull");
  }*/
}
