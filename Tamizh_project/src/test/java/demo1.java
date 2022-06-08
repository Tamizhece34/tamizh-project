import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sltam\\eclipse-workspace\\Sele\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit);
		
	}
		
}
