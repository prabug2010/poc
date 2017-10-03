package com.selenum.excel;

public class ReadExcelData {

	public static void main(String[] args) {

		ReadExcelCode2 rd = new ReadExcelCode2("C:\\Users\\pgunasekaran\\Desktop\\InputFile.xlsx");
		System.out.println(rd.getData(0, 1, 1));
	}

}
