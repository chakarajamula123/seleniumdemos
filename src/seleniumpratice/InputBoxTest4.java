package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxTest4 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		WebElement inputbox = driver.findElement(By.xpath("//input[@name='userName']"));
		boolean actualinputboxisdisplayed = inputbox.isDisplayed();
		boolean eceptedinputboxisdisplayed = true;
		if(actualinputboxisdisplayed == eceptedinputboxisdisplayed)
		{
			System.out.println("inputbox is displayed");	
			
		}
		else
		{
			System.out.println("inputbox is not displayed");
		}
		boolean actualinputboxisenable = inputbox.isEnabled();
		boolean exceptedinputboxisenable = true;
		if(actualinputboxisenable == exceptedinputboxisenable)
		{
			System.out.println("input box is enable");
		}
		else
		{
			System.out.println("input box is not enable");
		}
		
		
		String actualinputboxwatermark = inputbox.getText();
		String exceptedinputboxwatermark = "User Name";
		if(actualinputboxwatermark.equals(exceptedinputboxwatermark))
		{
			System.out.println("watermark is matched");
		}
		else
		{
			System.out.println("watermark is not matched");
		}
		
		inputbox.sendKeys("RBG");
		String inputboxtextdata = inputbox.getAttribute("value");
		System.out.println(inputboxtextdata);

	}

}
