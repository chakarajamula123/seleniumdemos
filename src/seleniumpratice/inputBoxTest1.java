package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class inputBoxTest1 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement inputboxtext = driver.findElement(By.xpath("//input[@id='identifierId']"));
		boolean actualinputboxisdisplayed = inputboxtext.isDisplayed();
		System.out.println("actualinputboxisdisplayed : "+actualinputboxisdisplayed);
		boolean exceptedinputboxisdisplayed = true;
			
			
		if(actualinputboxisdisplayed == exceptedinputboxisdisplayed)
		{
			System.out.println("inputbox is displayed");
		}
		else
		{
			System.out.println("inputbox is not displayed ");
		}
		
		boolean actualinputboxisenabled = inputboxtext.isEnabled();
		System.out.println("actualinputboxisenabled : "+actualinputboxisenabled);
		boolean exceptedinputboxisenabled = true;
		if(actualinputboxisenabled == exceptedinputboxisenabled)
		{
			System.out.println("inputbox is enabled");
		}
		else
		{
			System.out.println("inputbox is not enabled");
		}
		
		String actualwatermark = inputboxtext.getAttribute("aria-label");
		System.out.println("actualwatermark : "+actualwatermark);
		String exceptedwatermark = "Email or phone";
		if(actualwatermark.equals(exceptedwatermark))
		{
			System.out.println("watermark is matched");
		}
		else
		{
			System.out.println("watermark is not matched");
		}
		
		inputboxtext.sendKeys("RBG");
		String actualtextdata = inputboxtext.getAttribute("value");
		String exceptedtextdata = "RBG";
		if(actualtextdata.equals(exceptedtextdata))
		{
			System.out.println("data is matched");
		}
		else
		{
			System.out.println("data is not matched");
		}
		System.out.println(actualtextdata);
		
	}

}
