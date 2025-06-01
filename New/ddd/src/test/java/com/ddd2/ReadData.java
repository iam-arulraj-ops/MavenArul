package com.ddd2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\Intel\\Desktop\\ddd1.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheet("datas");

		int rowSize = s.getPhysicalNumberOfRows();

		System.out.println("Total number of rows:" + rowSize);

		int cellSize1 = s.getRow(0).getLastCellNum();

		System.out.println("Total number of cells:" + cellSize1);

		for (int i = 0; i < rowSize; i++) {

			Row r = s.getRow(i);

			int cellSize = r.getPhysicalNumberOfCells();

			// System.out.println("Total Number of cells: " + cellSize);

			for (int j = 0; j < cellSize; j++) {

				Cell c = r.getCell(j);

				CellType ce = c.getCellType();

				if (ce.equals(CellType.STRING)) {

					String ss = c.getStringCellValue();
					System.out.println(ss);
				} else if (ce.equals(CellType.NUMERIC)) {

					double no = c.getNumericCellValue();
					int k = (int) no;
					System.out.println(k);
				}
			}
		}
	}
}
