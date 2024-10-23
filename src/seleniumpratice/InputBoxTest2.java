package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputBoxTest2 
{

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='email']"));
		boolean actualinputboxisdisplayed = inputbox.isDisplayed();
		boolean exceptedinputboxisdisplayed = true;
		if(actualinputboxisdisplayed == exceptedinputboxisdisplayed)
		{
			System.out.println("inputbox is displayed");
		}
		else
		{
			System.out.println("inputbox is not displayed");
		}
		
		boolean actualinputboxisenabled = inputbox.isEnabled();
		boolean exceptedinputboxisenabled = true;
		if(actualinputboxisenabled == exceptedinputboxisenabled)
		{
			System.out.println("inputbox is enabled");
		}
		else
		{
			System.out.println("inputbox is not enabled");
		}
		String actualwatermark = inputbox.getAttribute("placeholder");
		System.out.println("actualwatermark : "+actualwatermark);
		String exceptedwatermark = "Email address or phone number";
		if(actualwatermark.endsWith(exceptedwatermark))
		{
			System.out.println("data is matched");
		}
		else
		{
			System.out.println("data is not matched");
		}
		
		inputbox.sendKeys("RBG");
		String actualtextdata = inputbox.getAttribute("value");
		String exceptedtextdata = "RBG";
		if(actualtextdata.equals(exceptedtextdata))
		{
			System.out.println("textdata is matched");
		}
		else
		{
			System.out.println("testdata is not matched");
		}

	}

}
