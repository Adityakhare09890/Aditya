package snippet;

public class Snippet {
	public static void main(String[] args) {
			String driverPath = System.getProperty("user.dir") + "\\executables\\chromedriver.exe";
			// step1: set driver executable path by using System.setProperty(String
			// key,String value)
			System.setProperty("webdriver.chrome.driver", driverPath);
			// step2: create an instance of Chrome Browser
			WebDriver driver = new ChromeDriver();
			// maximize browser
			driver.manage().window().maximize();
			// implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
			driver.get("https://www.demoblaze.com/");
	
			List<WebElement> categories = driver.findElements(By.cssSelector(".list-group>a"));
			System.out.println("Option count is: " + categories.size());
			//Creating expected result List
			List<String> l1=new ArrayList<String>();
			l1.add("CATEGORIES");
			l1.add("Phones");
			l1.add("Laptops");
			l1.add("Monitors");
			//Logic to get one by one element from the list and performing validation on that
			for (int i = 0; i < categories.size(); i++) {
				WebElement cat = categories.get(i);
				System.out.println("********* Element of List is: " + cat.getText() + "*********");
				System.out.println(cat.isDisplayed());
				System.out.println(cat.isEnabled());
				System.out.println(cat.getText().equals(l1.get(i)));
			}
		}
}
