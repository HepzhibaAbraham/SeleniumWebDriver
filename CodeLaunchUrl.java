package SeleniumWebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CodeLaunchUrl {
	public static void main(String args[])
	{
		//WebDriverManager.edgedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		
		//webdriver path- add WebdriveManager depedencies in pom.XML
		WebDriverManager.chromedriver().setup();
		
		//disable chrome notifications
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//instantiate the object
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.co.uk/");
		System.out.println("Title of the webpage: "+ driver.getTitle());
		System.out.println("Current Url of the webpage: "+ driver.getCurrentUrl());
		driver.close();
		
	}

}
