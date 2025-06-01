package com.webtables;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html#google_vignette");

		WebElement uk = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]"));
		String text = uk.getText();
		System.out.println("============Static Web Table=======");
		System.out.println("UK: "+text);
		System.out.println("============Dynamic Web Table=======");
		
		WebElement taiwanCapital = driver.findElement(By.xpath("//table[@border='1']/tbody/tr/th[@scope='row']/following::tr[2]/td[2]"));
		System.out.println("Capital of Taiwan: "+taiwanCapital.getText());
		
		WebElement saudiCapital = driver.findElement(By.xpath("//table[@border='1']/tbody/tr/th[@scope='row']/following-sibling::td[2]/span[text()='Mecca']"));
		System.out.println("Capital of Saudi Arabia: "+saudiCapital.getText());
	}
}