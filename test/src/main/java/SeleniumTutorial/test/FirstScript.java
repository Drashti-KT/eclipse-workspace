package SeleniumTutorial.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	public static void main(String[] args) {
		// Browser setup
		
		//WebDriverManager.chromedriver().setup();
		
        // open browser
		
		WebDriver driver= new ChromeDriver();
		
		// Redirect to google
		driver.get("https://www.google.com/");
		
		//WebElement textbox=driver.findElement(By.id("APjFqb"));
		
		WebElement textbox=driver.findElement(By.className("gLFyf"));
		textbox.sendKeys("Selenium");
		
		driver.findElement(By.id("btnk")).click();
		
		driver.close();
				
	}

}
