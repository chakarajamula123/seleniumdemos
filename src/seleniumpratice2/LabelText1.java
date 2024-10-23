package seleniumpratice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LabelText1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement text =  driver.findElement(By.xpath("//span[text()='to continue to Gmail']"));
		String actualText = text.getText();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		String expectedText = "to Continue to Gmail";
		if(actualText.equals(expectedText))
		{
			System.out.println("data is matching");
		}
		else
		{
			System.out.println("data is not matching");
		}
	}

}
