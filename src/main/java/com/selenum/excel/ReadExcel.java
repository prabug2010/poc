package com.selenum.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadExcel {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("/poc/src/main/java/com/selenum/excel/InputFile.xlsx");
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 XSSFSheet sheet = workbook.getSheet("input");
		 XSSFRow row = sheet.getRow(0);
		 
	        int col_num = -1;
	 
	        for(int i=0; i < row.getLastCellNum(); i++)
	        {
	            if(row.getCell(i).getStringCellValue().trim().equals("Name"))
	                col_num = i;
	        }
	 
	        row = sheet.getRow(1);
	        XSSFCell cell = row.getCell(col_num);
	 
	        String value = cell.getStringCellValue();
	        System.out.println("Value of the Excel Cell is - "+ value);
	    

	    }
	}