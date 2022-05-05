package Browser_operations;


import org.openqa.selenium.firefox.FirefoxDriver;


public class Oenbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String path1="C:\\Users\\DELL\\eclipse-workspace\\Selenium traning\\Executable\\geckodriver.exe";
System.setProperty("webdriver.gecko.driver",path1);
FirefoxDriver cdriver=new FirefoxDriver();


	}

}
