import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 { 
	// TODO - 
	//1. Get the total number of rows in a table
	//2. Get the total no. of rows
	//3. Get the data of third row
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement myTable = driver.findElement(By.id("product"));
//------no. of rows		
		
		System.out.println(myTable.findElements(By.tagName("tr")).size());
//------no. of col
		
		System.out.println(myTable.findElements(By.xpath("//table[@class= 'table-display']/tbody/tr[1]/th")).size());
		
		
		List <WebElement> secondRow = myTable.findElements(By.xpath("//table[@class= 'table-display']/tbody/tr[3]/td"));
		
		System.out.println(secondRow.size());
		
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());
		
		
//----- One more way to do the same------
		
		
		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
////---Get no. of rows--------
//		
//		int rowNos = driver.findElements(By.xpath("//table[@class= 'table-display']/tbody/tr")).size();
//		
//		System.out.println("Total no of rows " + rowNos);
////---Get no. of col------
//		
//		int colNos = driver.findElements(By.xpath("//table[@class= 'table-display']/tbody/tr/th")).size();
//		
//		System.out.println("Total no of col " +colNos);
//		
////--Get data of col3
//		System.out.println("Col1 Row2 " + driver.findElement(By.xpath("//table[@class= 'table-display']/tbody/tr[3]/td[1]")).getText());
//		System.out.println("Col2 Row2 " + driver.findElement(By.xpath("//table[@class= 'table-display']/tbody/tr[3]/td[2]")).getText());
//		System.out.println("Col3 Row2 " + driver.findElement(By.xpath("//table[@class= 'table-display']/tbody/tr[3]/td[3]")).getText());
//		
//		
		driver.close();
		
	}

}
