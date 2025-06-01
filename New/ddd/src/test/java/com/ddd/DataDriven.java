package com.ddd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	
	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\Intel\\Desktop\\ddd.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s= wb.getSheet("data");
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(0);
		
		CellType ce = c.getCellType();
		
		int no = r.getLastCellNum();
		System.out.println("Cell Numbers: "+no);
		
		if(ce.equals(CellType.STRING)) {
			
			String ss = c.getStringCellValue();
			System.out.println("String value: "+ss);
		}
		else if (ce.equals(CellType.NUMERIC)) {
			
			double e = c.getNumericCellValue();
			int i= (int) e;
			System.out.println("Numeric value: "+i);
			
		}
	}
}
