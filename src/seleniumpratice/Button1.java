package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement buttonElement = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		boolean actualbuttonelementisdisplayed = buttonElement.isDisplayed();
		boolean exceptedbuttonelementisdisplayed = true;
		if(actualbuttonelementisdisplayed == exceptedbuttonelementisdisplayed)
		{
			System.out.println("button element is displayed");
		}
		else
		{
			System.out.println("button element is not displayed");
		}

		boolean actualbuttonelementisenabled = buttonElement.isEnabled();
		boolean exceptedbuttonelementisenabed = true;
		if(actualbuttonelementisenabled == exceptedbuttonelementisenabed)
		{
			System.out.println("button element is enable");
		}
		else
		{
			System.out.println("button element is not enable");
		}
		String actualbuttonwatermark = buttonElement.getText();
		System.out.println(actualbuttonwatermark);
		String exceptedbuttonwatermark = "Log in";
		if(actualbuttonwatermark.equals(exceptedbuttonwatermark))
		{
			System.out.println("watermark is matched");
		}
		else
		{
			System.out.println("watermark is not matched");
		}
		buttonElement.click();
	}

}
