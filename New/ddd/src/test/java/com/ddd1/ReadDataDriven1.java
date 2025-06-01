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

public class ReadDataDriven1 {

	public static void main(String[] args) throws IOException {

		readData1();
	}

	public static void readData1() throws IOException {

		File f = new File("C:\\Users\\Intel\\Desktop\\ddd1.xlsx");

		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheet("datas");

		int rowSize = s.getPhysicalNumberOfRows();
		System.out.println("Row Size: " + rowSize);

		int cellSize = s.getRow(0).getLastCellNum();
		System.out.println("Cell Size: " + cellSize);

		for (int i = 0; i < rowSize; i++) {
			Row r = s.getRow(i);

			for (int j = 0; j < cellSize; j++) {

				Cell c = r.getCell(j);

				CellType ce = c.getCellType();

				if (ce.equals(CellType.STRING)) {

					String ss = c.getStringCellValue();
					System.out.println("String Value: " + ss);
				} else if (ce.equals(CellType.NUMERIC)) {

					double d = c.getNumericCellValue();
					int e = (int) d;
					System.out.println("Numeric Value: " + e);
				}
			}
		}
		System.out.println("Success Message");

	}
}