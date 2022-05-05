package Browser_operations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opengoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",".\\Executable\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
String sourcecode=driver.getPageSource();
System.out.println("Application source code:"+sourcecode);
System.out.println("Application source code:"+sourcecode.length());
driver.close();

	}

}
