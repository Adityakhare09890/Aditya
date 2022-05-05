import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtility;

public class multielement {
	SeleniumUtility s1=new SeleniumUtility();
	WebDriver driver=s1.setUp("chrome", "https://www.amazon.in/");
	
	//Identify all the link from main menu using findElements(By)
	List<WebElement> allOptions=driver.findElements(By.cssSelector("#nav-xshop>a"));
	
	{
		for(int i=0;i<allOptions.size();i++)
	{
		
		WebElement option=allOptions.get(i);
		String name=option.getText();
		System.out.println("Option Name: "+name);
		if(name.equals("Amazon Pay"))
		{
			option.click();
			break;
		}else {
			System.out.println("Not matched.....");
		}
	}
	}
}
