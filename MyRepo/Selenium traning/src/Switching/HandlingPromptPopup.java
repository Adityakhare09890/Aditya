package Switching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.SeleniumUtility;

public class HandlingPromptPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//as the required element is present inside the frame, so need to switch our control inside frame first
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		System.out.println("Alert text msg is: "+driver.switchTo().alert().getText());
		//to perform another action on alert, we need to again switch our control to the alert
		driver.switchTo().alert().sendKeys("Pune");
		//to perform another action on alert, we need to again switch our control to the alert
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}

	}


