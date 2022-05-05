package Calender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtility;

public class Handelingcalender {

	public static void main(String[] args) {
		SeleniumUtility S1= new SeleniumUtility();
		WebDriver driver=S1.setUp("chrome","https://www.redbus.in/");
	driver.findElement(By.id("src")).sendKeys("Swargate, Pune");
	driver.findElement(By.id("dest")).sendKeys("Mapusa, Goa");
	
	driver.findElement(By.xpath("//label[@class='db text-trans-uc move-up']")).click();
	driver.findElement(By.xpath("//td[@class='next']")).click();
	driver.findElement(By.xpath("//td[@class='next']")).click();

	
	
	
	
	
/*	
	driver.findElement(By.xpath("//label[@class='db text-trans-uc']")).click();
	
	driver.findElement(By.xpath("(//td[@class='wd day'])[5]")).click();
	//driver.findElement(By.xpath("//button[@class='fl button']")).click();
	driver.findElement(By.id("search_btn")).click();
	driver.findElement(By.cssSelector("#search_btn")).click();
	
	*/
	

	}

}
