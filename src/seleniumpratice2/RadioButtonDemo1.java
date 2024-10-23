package seleniumpratice2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonDemo1
{

	public static void main(String[] args) 
	{
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/reservation.php");
	WebElement radiobutton = driver.findElement(By.xpath("//input[@name='tripType'and@value='oneway']"));
	WebElement radiobuttonforselect = driver.findElement(By.xpath("//input[@name='tripType'][2] "));
    driver.manage().window().maximize();  //input[type='radio'][name='tripType']
	boolean actualradiobuttonisdisplayed = radiobutton.isDisplayed();
    boolean expectedradiobuttonisdisplayed = true;
    if(actualradiobuttonisdisplayed==expectedradiobuttonisdisplayed)
    {
    	System.out.println("radiobutton is displayed");
    }
    else
    {
    	System.out.println("radiobutton is not displayed");
    }
    boolean actualradiobuttonisenabled = radiobutton.isEnabled();
    boolean expectedradiobuttonisenabled = true;
    if(actualradiobuttonisenabled==expectedradiobuttonisenabled)
    {
    	System.out.println("radiobutton is enabled");
    }
    else
    {
    	System.out.println("radiobutton is not enabled");
    }
    boolean actualradiobuttonisselected = radiobutton.isSelected();
    boolean expectedradiobuttonisselected = true;
    if(actualradiobuttonisselected==expectedradiobuttonisselected)
    {
    	System.out.println("radiobutton is selected");
    }
    else
    {
    	System.out.println("radiobutton is not selected");
    }
    radiobutton.click();
    boolean actualradiobuttonisselectedafterclick = radiobuttonforselect.isSelected();
    boolean expectedradiobuttonisselectedafterclick = true;
    if(actualradiobuttonisselectedafterclick==expectedradiobuttonisselectedafterclick)
    {
    	System.out.println("radiobutton is selected afterclick");
    }
    else
    {
    	System.out.println("radiobutton is not selected afterclick");
    }
	}

}
