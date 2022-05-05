package Browser_operations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="C:\\Users\\DELL\\eclipse-workspace\\Selenium traning\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");

		// Get current page source code and print the length in the console 
				
			
				//Get current url from the application and print in the console 
				System.out.println("Application current URL: "+driver.getCurrentUrl());
				//Get current page title and print in the console 
				System.out.println("Application current Title: "+driver.getTitle());
				String Title=driver.getTitle();
				System.out.println("Title lenght is:"+Title.length());
				if(driver.getTitle().equals("actiTIME - Login")) {
					System.out.println("actitime-login page opened successfully...");
				}else {
					System.out.println("Either google search page not opened or its title got changed");
				}
				WebElement userNameInputField=driver.findElement(By.id("username"));
				userNameInputField.sendKeys("admin");

				WebElement pwdInputField=driver.findElement(By.name("pwd"));
				pwdInputField.sendKeys("manager");
				
				WebElement loginButtn=driver.findElement(By.id("loginButton"));
				loginButtn.click();
				
				String actualhomepagetitle=driver.getTitle();
				System.out.println("Actual home page title:"+actualhomepagetitle);
				String expectedhomepagetitle= "actiTIME - Enter Time-Track";
				if(driver.getTitle().equals(expectedhomepagetitle)) {
					System.out.println("actitime-login page opened successfully...");
				}else {
					System.out.println("Either google search page not opened or its title got changed");
				}
				driver.findElement(By.id("logoutLink")).click();
				
	}

}
