package com.ddd1;

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

	
	public static void readAllData() throws IOException {
		
		File f = new File("C:\\\\Users\\\\Intel\\\\Desktop\\\\ddd.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheet("data");
		
		int rowSize = s.getPhysicalNumberOfRows();
		
		for(int i=0;i<rowSize;i++) {
			
			Row r = s.getRow(i);
			
			int cellSize = r.getPhysicalNumberOfCells();
			
			for(int j=0;j<cellSize;j++) {
				
				Cell c = r.getCell(j);
				
				CellType ce = c.getCellType();
				
				if(ce.equals(CellType.STRING)) {
					
					String ss = c.getStringCellValue();
					System.out.println(ss);
				}
				else if(ce.equals(CellType.NUMERIC)) {
					
					double e = c.getNumericCellValue();
					int i1 =(int) e;
					System.out.println(i1);
				}}
			}}
			public static void main(String[] args) throws IOException {
				readAllData();
			}
}