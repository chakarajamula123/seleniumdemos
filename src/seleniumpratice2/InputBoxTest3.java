package seleniumpratice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxTest3 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='email']"));
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
		String actualwatermark = inputbox.getAttribute("placeholder");
		System.out.println("actualwatermark :"+actualwatermark);
		String expectedwatermark ="Email address or phone number";
		if(actualwatermark.equals(expectedwatermark))
		{
			System.out.println("watermark is displaying");
		}
		else
		{
			System.out.println("watermark is not displaying");
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
