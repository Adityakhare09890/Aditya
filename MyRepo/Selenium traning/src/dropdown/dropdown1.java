package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.SeleniumUtility;

public class dropdown1 {
	public static void main(String[] args) {

	SeleniumUtility s1=new SeleniumUtility();
	WebDriver driver=s1.setUp("chrome", "https://thompsonsj.com/bootstrap-select-dropdown/");
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement dropdown=driver.findElement(By.id("bsd1-button"));
	//identify dropdown list and click on it

	wait.until(ExpectedConditions.elementToBeClickable(dropdown));
	//identify dropdown list and click on it
	dropdown.click();

	//identify all the options and store them into List<WebElement>
	List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
	//use size() to get option count
	System.out.println("options count :"+options.size());
	for(int i=0;i<=options.size();i++)
	 {
		System.out.println(options.get(i).getText());
	}
	}
}

