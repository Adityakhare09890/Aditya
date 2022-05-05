package Browser_operations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArenaPaginatio {

	public static <webelement> void main(String[] args) {
		String path1="C:\\Users\\DELL\\eclipse-workspace\\Selenium traning\\Executable\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path1);
		ChromeDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				driver.get("https://www.gsmarena.com/samsung-phones-9.php");
List<webelement>paginationLinks=(List<webelement>) driver.findElement(By.cssSelector(".nav-pages>a"));
if(paginationLinks.size()>0)
{System.out.println("Paginationexist..");
for(int i=0;i<paginationLinks.size();i++)
{
	((WebElement) paginationLinks.get(i)).click();
	System.out.println(driver.getCurrentUrl());
}
}
	}

}
;