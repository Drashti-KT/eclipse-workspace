public class SP

{

	package ABC.FirstMaven;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;

	/**
	 * Unit test for simple App.
	 */
	public class AppTest {

	    /**
	     * Rigorous Test :-)
	     */
	    @Test
	    public static void main(String[] args) {
	    	
	    	// browser setup
	    	WebDriverManager.chromedriver().setup();
	    	
	    	//open browser
	    	WebDriver driver= new ChromeDriver();
	    	
	    	driver.get("https://www.google.com/");
	    	
	        assertTrue(true);
	    }
	}

}
