package com.ddd;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverDDD {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		File f = new File("C:\\Users\\Intel\\Desktop\\ddd.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s = wb.getSheet("data");
		
		int rowNum= s.getLastRowNum();
		int colNum= s.getRow(0).getLastCellNum();
		System.out.println("Total row numbers: "+rowNum);
		System.out.println("Total column numbers: "+colNum);
		
		for(int i=1;i<=rowNum;i++) {
			Row r = s.getRow(i);
			
			int no = (int) r.getCell(0).getNumericCellValue();
			String user = r.getCell(1).getStringCellValue();
			String mail= r.getCell(2).getStringCellValue();
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(mail);
			driver.findElement(By.id("pass")).clear();
			driver.findElement(By.id("pass")).sendKeys(user);
			driver.findElement(By.name("login")).click();
			Thread.sleep(3000);
			driver.navigate().refresh();
			
			System.out.println(no+"."+mail+"||"+user+"||");
		}
		driver.quit();
	}

}
