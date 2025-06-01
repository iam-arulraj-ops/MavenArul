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

public class DataDriven1 {

	public static void main(String[] args) throws IOException {
		readData();

	}

	public static void readData() throws IOException {

		File f = new File("C:\\Users\\Intel\\Desktop\\ddd1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheet("Datas");

		int rowSize = s.getPhysicalNumberOfRows();
		System.out.println("No. of rows: " + rowSize);

		int cellSize = s.getRow(0).getLastCellNum();
		System.out.println("No. of cells: " + cellSize);

		for (int i = 0; i < rowSize; i++) {
			Row r = s.getRow(i);

			for (int j = 0; j < cellSize; j++) {
				Cell c = r.getCell(j);

				CellType ce = c.getCellType();

				if (ce.equals(CellType.STRING)) {
					String ss = c.getStringCellValue();
					System.out.println(ss);

				} else if (ce.equals(CellType.NUMERIC)) {
					double e = c.getNumericCellValue();
					int l = (int) e;
					System.out.println(l);

				}
			}
		}
		System.out.println("========Success Message===========");
	}
}