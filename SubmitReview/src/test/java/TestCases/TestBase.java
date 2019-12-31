package TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static WebDriver driver = null; 
	  
    @BeforeSuite
    public void initialize() throws IOException, Exception { 
  
        System.setProperty("webdriver.chrome.driver", 
        System.getProperty("user.dir") +  
            "\\src\\test\\java\\driver\\chromedriver.exe"); 
    
        driver = new ChromeDriver(); 
    
        // To maximize browser 
        driver.manage().window().maximize(); 
    
        // Implicit wait 
        driver.manage().timeouts().implicitlyWait( 
             10, TimeUnit.SECONDS); 
        
        driver.get("https://www.tripadvisor.in/");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
    } 
    
  
    @AfterSuite
    // Test cleanup 
    public void TeardownTest() { 
        TestBase.driver.quit(); 
    } 
	
	
}
