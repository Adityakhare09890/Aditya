package Browser_operations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator4 {
	

	


		public static void main(String[] args) {
			String path1="C:\\Users\\DELL\\eclipse-workspace\\Selenium traning\\Executable\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path1);
			ChromeDriver driver=new ChromeDriver();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//maximize the browser window
			driver.manage().window().maximize();
			//implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			String cred=driver.findElement(By.tagName("span")).getText();
			System.out.println(cred);
			
		cred=cred.replace("( Username : ", "");
		cred=cred.replace(" | Password : ", " ");
				cred=cred.replace(" )", "");
			System.out.println(cred);
			String[] loginDetails=cred.split(" ");
			driver.findElement(By.id("txtUsername")).sendKeys(loginDetails[0]);
			driver.findElement(By.id("txtPassword")).sendKeys(loginDetails[1]);
			
		/*	String []loginDetails=cred.split(" ");
			driver.findElement(By.id("txtUsername")).sendKeys(loginDetails[3]);
			driver.findElement(By.id("txtPassword")).sendKeys(loginDetails[7]);
			driver.findElement(By.id("btnLogin")).click();*/
			
}
}
