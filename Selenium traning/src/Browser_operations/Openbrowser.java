package Browser_operations;

import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get required browser executable path
				String path1="C:\\Users\\DELL\\eclipse-workspace\\Selenium traning\\Executable\\chromedriver.exe";
				String path2=".\\Executable\\chromedriver.exe";
				String path3=System.getProperty("user.dir")+"\\Executable\\chromedriver.exe";
				//set required browser executable path using System.setProperty(String key,String value)
				System.setProperty("webdriver.chrome.driver", path2);
				//create an instance of required browser class
				ChromeDriver driver=new ChromeDriver();
			
	}

}
