package selfPractise;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//To capture cookie from browser
		Set <Cookie> cookies =driver.manage().getCookies();
		System.out.println("Size of cookie:"+" "+ cookies);
		
		//To print cookies
		for(Cookie el:cookies) {
			System.out.println(el.getName() +" "+ el.getValue());
		}
		//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("cake",Keys.ENTER);
		driver.close();
	}

}
