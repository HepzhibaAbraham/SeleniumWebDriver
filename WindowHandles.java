package selfPractise;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class WindowHandles {
	
	@Test
	public void myWindow() {
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//String window1=driver.getWindowHandle();
		//System.out.println(window1);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a"))
		.click();
		
		Set<String> windowIDs= driver.getWindowHandles();
		Iterator<String> id= windowIDs.iterator();
		String parentWindowId= id.next();
		String childWindowId= id.next();
		
		System.out.println("parent window is" + parentWindowId);
		System.out.println("child window is" +  childWindowId);
		
		//driver.close();

	}

}
