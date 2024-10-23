package seleniumpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton1 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.manage().window().maximize();
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='femalerb']"));
		radiobutton.click();
		WebElement englishcheckbox1 = driver.findElement(By.xpath("//input[@id='englishchbx']"));
		englishcheckbox1.click();
		WebElement hindicheckbox1 = driver.findElement(By.xpath("//input[@id='hindichbx']"));
		boolean actualhindicheckbox1isselected = hindicheckbox1.isSelected();
		if(actualhindicheckbox1isselected == true)
		{
			System.out.println("is selected");
			hindicheckbox1.click();
		}
		else
		{
			System.out.println("is not selected");
			hindicheckbox1.click();
		}
		Thread.sleep(3000);
		hindicheckbox1.click();
		Thread.sleep(3000);
		if(hindicheckbox1.isSelected())
		{
			hindicheckbox1.click();
		}

		WebElement button = driver.findElement(By.xpath("//button[@id='registerbtn']"));
		button.click();
		WebElement afterclickbuttonlabeldata = driver.findElement(By.xpath("//label[text()='Registration is Successful']"));
		String getdata = afterclickbuttonlabeldata.getText();
		System.out.println(getdata);
		
		WebElement link = driver.findElement(By.xpath("//a[@id='navigateHome']"));
		link.click();
		String linkdata = link.getText();
		System.out.println(linkdata);
	}
}
