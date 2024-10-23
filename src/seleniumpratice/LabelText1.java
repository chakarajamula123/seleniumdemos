package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelText1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		 WebElement labelText = driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		 String actualResult = labelText.getText();
		 String expectedResult = "to Continue to Gmail";
		 if(actualResult.equals(expectedResult))
		 {
			 System.out.println("data is mached");
		 }
		 else
		 {
			 System.out.println("data is not matched");
		 }
		System.out.println(actualResult);
		 
	}
}
