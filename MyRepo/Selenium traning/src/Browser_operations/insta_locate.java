package Browser_operations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class insta_locate {

	public static void main(String[] args) {
		String path1="C:\\Users\\DELL\\eclipse-workspace\\Selenium traning\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		ChromeDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				driver.get("https://www.instagram.com/");

	/*	String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();//0-30
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
		}
		//identify the required element from the UI and perform reqiored action 0-30*/
		driver.findElement(By.name("username")).sendKeys("Khareaditya1997@gmail.com");
		//identify the required element from the UI and perform reqiored action 0-30
		driver.findElement(By.name("password")).sendKeys("Adityakhare@123");
		//identify the required element from the UI and perform reqiored action
		driver.findElement(By.cssSelector(".sqdOP.L3NKy")).click(); //0-30
		
		

		WebElement notnow=driver.findElement(By.cssSelector(".cmbtv"));
		//explicit wait
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(notnow));

		//driver.findElement(By.cssSelector(".sqdOP.L3NKy.y3zKF")).click(); 
		
	}

}
