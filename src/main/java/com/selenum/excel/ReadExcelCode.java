package com.selenum.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelCode {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\pgunasekaran\\Desktop\\InputFile.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String data1 = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		int n = sheet.getLastRowNum();
		
		System.out.println("The no of rows are : "+n);
		for(int i=1; i<=n; i++)
		{
			String s = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(s);
		}
		
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(3).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(4).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(4).getCell(1).getStringCellValue());
		
		LinkedHashMap<String, LinkedList<String>> lhm = new LinkedHashMap<String, LinkedList<String>>();
		LinkedList<String> l1 = new LinkedList<String> ();
		l1.add(sheet.getRow(1).getCell(0).getStringCellValue());
		l1.add(sheet.getRow(2).getCell(0).getStringCellValue());
		l1.add(sheet.getRow(3).getCell(0).getStringCellValue());
		l1.add(sheet.getRow(4).getCell(0).getStringCellValue());
		
		LinkedList<String> l2 = new LinkedList<String> ();
		l2.add(sheet.getRow(1).getCell(1).getStringCellValue());
		l2.add(sheet.getRow(2).getCell(1).getStringCellValue());
		l2.add(sheet.getRow(3).getCell(1).getStringCellValue());
		l2.add(sheet.getRow(4).getCell(1).getStringCellValue());
		
		lhm.put(sheet.getRow(0).getCell(0).getStringCellValue(), l1);
		lhm.put(sheet.getRow(0).getCell(1).getStringCellValue(), l2);
		
		Set s1 = lhm.entrySet();
		System.out.println(s1);
		
		for(Map.Entry<String, LinkedList<String>> e : lhm.entrySet())
		{
			System.out.println("key : "+e.getKey());
			System.out.println("value : "+e.getValue());
		}
	
	}

}
