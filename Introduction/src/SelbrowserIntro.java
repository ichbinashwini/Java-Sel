
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelbrowserIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//CHROME DRIVER
		//System.setProperty("webdriver.chrome.driver", "/Users/coditas/Documents/chromedriver_mac64");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		//EDGE DRIVER
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver = new EdgeDriver();
		
		//FIREFOX DRIVER (Not working yet)
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		System.out.println (driver.getTitle());
		System.out.println (driver.getCurrentUrl());
			
		

	}

}
