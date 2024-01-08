import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		SoftAssert sa = new SoftAssert();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement FooterDriver = driver.findElement(By.id("gf-BIG"));
		
		List <WebElement> AllLinksWebEle = FooterDriver.findElements(By.tagName("a"));
		System.out.println(AllLinksWebEle.size());
		
		
		for (WebElement each : AllLinksWebEle ) 
		{
			String url = each.getAttribute("href");
			//System.out.println(i + url);
			
			
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int resCode = conn.getResponseCode();
			

			System.out.println(each.getText());
			sa.assertTrue(resCode < 400,each.getText() + " Is broken" + "Due to "+ resCode );
		
		
		}
		sa.assertAll();
		
		driver.close();
	}

}
