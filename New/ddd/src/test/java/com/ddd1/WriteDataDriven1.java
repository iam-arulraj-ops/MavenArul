package com.ddd1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataDriven1 {

	public static void main(String[] args) throws IOException {

		writeData1();
	}

	public static void writeData1() throws IOException {

		File f = new File("C:\\Users\\Intel\\Desktop\\ddd1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("datas1").createRow(0).createCell(0).setCellValue("password");
		wb.getSheet("datas1").getRow(0).createCell(1).setCellValue("username");

		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Success message");
	}
}