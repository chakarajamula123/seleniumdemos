package seleniumpratice2;

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
		boolean actualinputboxisdisplayed=inputbox.isDisplayed();
		System.out.println("actualinputboxisdisplayed :"+actualinputboxisdisplayed);
		boolean expectedinputboxisdisplayed=true;
		if(actualinputboxisdisplayed==expectedinputboxisdisplayed)
		{
			System.out.println("inputbox is displayed");

		}
		else
		{
			System.out.println("inputbox is not displayed");
		}
		boolean actualinputboxisenabled=inputbox.isEnabled();
		System.out.println("actualinputboxisenabled :" +actualinputboxisenabled);
		boolean expectedinputboxisenabled=true;
		if(actualinputboxisenabled==expectedinputboxisenabled)
		{
			System.out.println("inputbox is enabled");
		}
		else
		{
			System.out.println("inputbox is not enabled");
		}
		String actualwatermark = inputbox.getText();
		System.out.println("actualwatermark :"+actualwatermark);
		String expectedwatermark ="User Name";
		
		if(actualwatermark.equals(expectedwatermark))
		{
			System.out.println("watermark is matched");
		}
		else
		{
			System.out.println("watermark is not matched");
		}

		inputbox.sendKeys("RBG");


		String actualwatermark1 = inputbox.getAttribute("value");
		System.out.println("actualwatermark1 :"+actualwatermark1);
		String expectedwatermark1 ="RBG";
		if(actualwatermark1.equals(expectedwatermark1))
		{
			System.out.println("data is vallid");	
		}
		else
		{
			System.out.println("data is not vallid");
		}
	}

}
