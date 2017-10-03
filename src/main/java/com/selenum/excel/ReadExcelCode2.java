package com.selenum.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelCode2 {
	
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	
	public ReadExcelCode2(String excelpath)
	{
		try
		{
			File file = new File("D:\\Eclipse\\eclipse-workspace\\poc\\TestData\\TestData.xlsx");
			FileInputStream fis = new FileInputStream(file);
			workbook = new XSSFWorkbook(fis);
			
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public String getData(int sheetNumber, int row, int column)
	{
		sheet = workbook.getSheetAt(sheetNumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();	
		return data;
	}
	
	public int getRowCount(int sheetIndex)
	{
		int rowcount = workbook.getSheetAt(sheetIndex).getLastRowNum();
		rowcount=rowcount;
		return rowcount;
	}
}