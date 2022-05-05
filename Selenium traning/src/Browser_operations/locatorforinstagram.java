package Browser_operations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorforinstagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path1="C:\\Users\\DELL\\eclipse-workspace\\Selenium traning\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");

		// Get current page source code and print the length in the console 
				
			
				//Get current url from the application and print in the console 
				System.out.println("Application current URL: "+driver.getCurrentUrl());
				//Get current page title and print in the console 
				System.out.println("Application current Title: "+driver.getTitle());
				String Title=driver.getTitle();
				System.out.println("Title lenght is:"+Title.length());
				if(driver.getTitle().equals("Instagram")) {
					System.out.println("Instagram page opened successfully...");
				}else {
					System.out.println("Either google search page not opened or its title got changed");
				}
				WebElement userNameInputField=driver.findElement(By.name("username"));
				userNameInputField.sendKeys("Khareaditya1997@gmail.com");

				WebElement pwdInputField=driver.findElement(By.name("password"));
				pwdInputField.sendKeys("Adityakhare@123");
				
				WebElement loginButtn=driver.findElement(By.className(" sqdOP  L3NKy   y3zKF      "));
				loginButtn.click();
	}

}
