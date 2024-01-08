import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotActivity {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		
		String actualDate = date.toString().replace(":", "").replace(" ","");
		File src  = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(src, new File ("/Users/coditas/Documents/ss1/ "+actualDate+".jpeg"));
		
		driver.close();
		
		
		
		

	}

}
