import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.SeleniumUtility;

public class handelingcal {

	public static void main(String[] args) throws Throwable {
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver= s1.setUp("chrome", "https://www.redbus.in/");
		
		  driver.findElement(By.id("src")).sendKeys("pune");
		 
        List<WebElement> options = driver.findElements(By.cssSelector(".autoFill.homeSearch>li"));
       System.out.println("get the no. of pickup stops "+options.size());
       
       for(int i=0;i<options.size();i++) {
    	  WebElement selectes= options.get(i);
    	  String option=selectes.getText();
       
    	  if(option.equalsIgnoreCase("wakad, pune")) {
    		  selectes.click();
    	break;  }  
       }
       
     WebElement clickable=driver.findElement(By.cssSelector(".fl.search-box>div>input[id='dest']"));
     clickable.sendKeys("goa");
       
       List<WebElement> options2 = driver.findElements(By.cssSelector(".fl.search-box>div>ul>li"));
       System.out.println("get the no. of destination stops "+options2.size());
        
       for(int l=0;l<options2.size();l++) {
    	  WebElement selectes2= options2.get(l);
    	  String option2=selectes2.getText();
       
    	  if(option2.equalsIgnoreCase("madgaon, goa")) {
    		  selectes2.click(); 
    	  break;} 
       }
       
       driver.findElement(By.cssSelector(".rb-calendar>table>tbody>tr")).click();
       
       driver.findElement(By.cssSelector(".next>button")).click();
       
       List<WebElement> dates=driver.findElements(By.cssSelector(".rb-monthTable.first.last>tbody>tr>td[class='wd day']"));
       	   System.out.println("want to know the size= "+dates.size());
       	   for(int m=0;m<dates.size();m++) {
       		   WebElement selectdates=dates.get(m);
       		   String getdates=selectdates.getText();
       		   if(getdates.equals("4")) {
       			selectdates.click();
       		
       		 break;  }
       		
       		     } 
//       WebElement showdates =driver.findElement(By.cssSelector(".fl.date-box.gtm-onwardCalendar>div>input"));
//       //	showdates.getText();
//       System.out.println("dates selected for travel "+showdates.getText());
       	   driver.findElement(By.id("search_btn")).click();
        driver.findElement(By.cssSelector(".details>ul.dept-time.dt-time-filter>li>label[for='dtAfter 6 pm']")).click();
        driver.findElement(By.cssSelector(".list-chkbox>li>label[for='bt_AC']")).click();
	}
}
