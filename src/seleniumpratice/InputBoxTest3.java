package seleniumpratice;

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
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='pass']"));
		String actualInputWaterMark = inputbox.getAttribute("placeholder");
		String exceptedInputWatermark = "Password";

		if(actualInputWaterMark.equals(exceptedInputWatermark))
		{
			System.out.println("inputbox watermark is matched");
		}
		else
		{
			System.out.println("inputbox watermark is not matched");
		}
		System.out.println(actualInputWaterMark);

		inputbox.sendKeys("RBG");
		String actualinputboxtextdata = inputbox.getAttribute("value");
		String exceptedinputboxtextdata = "RBG";
		if(actualinputboxtextdata.equals(exceptedinputboxtextdata))
		{
			System.out.println("text data is matched");
		}
		else
		{
			System.out.println("text data is not matched");
		}
		System.out.println(actualinputboxtextdata);

		/*boolean actualinputboxisdiplayed = inputbox.isDisplayed();
		boolean exceptedinputboxisdisplayed = true;*/
		if(inputbox.isDisplayed() == true)
		{
			System.out.println("inputbox is displayed");
			if(inputbox.isEnabled())
			{
				System.out.println("inputbox is enable");
			}
			else
			{
				System.out.println("inputbox is not enable");
			}
		}
		else
		{
			System.out.println("inputbox is not diplayed");
		}

	}

}
