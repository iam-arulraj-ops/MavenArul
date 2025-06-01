package com.ddd1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataDriven {

	public static void main(String[] args) throws IOException {

		writeData();
	}
	public static void writeData() throws IOException {
		
		File f = new File("C:\\Users\\Intel\\Desktop\\ddd.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		wb.createSheet("data2").createRow(0).createCell(0).setCellValue("email");
		
		wb.getSheet("data2").getRow(0).createCell(1).setCellValue("password");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("==================Success==============");
	}
}