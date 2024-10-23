package seleniumpratice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonDemo1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement button =	driver.findElement(By.xpath("//button[@id='loginbutton']"));
		boolean actualbuttonisdisplayed=button.isDisplayed();
		System.out.println("actualbuttonisdisplayed :"+actualbuttonisdisplayed);
		boolean expectedbuttonisdisplayed=true;
		if(actualbuttonisdisplayed==expectedbuttonisdisplayed)
		{
			System.out.println("button is displayed");

		}
		else
		{
			System.out.println("button is not displayed");
		}
		boolean actualbuttonisenabled=button.isEnabled();
		System.out.println("actualbuttonisenabled :" +actualbuttonisenabled);
		boolean expectedbuttonisenabled=true;
		if(actualbuttonisenabled==expectedbuttonisenabled)
		{
			System.out.println("button is enabled");
		}
		else
		{
			System.out.println("button is not enabled");
		}
		String actualText = button.getText();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		String expectedText = "Log In";
		if(actualText.equals(expectedText))
		{
			System.out.println("data is matching");
		}
		else
		{
			System.out.println("data is not matching");
		}
		System.out.println(actualText);
		button.click();
	}

}
