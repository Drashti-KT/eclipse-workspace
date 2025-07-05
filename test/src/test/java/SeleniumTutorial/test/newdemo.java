package SeleniumTutorial.test;

import org.openqa.selenium.chrome.ChromeDriver;

public class newdemo {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title =driver.getTitle();
		if(title.equals("Google"))
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
