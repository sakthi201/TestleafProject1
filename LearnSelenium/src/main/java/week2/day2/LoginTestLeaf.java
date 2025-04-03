package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestLeaf {
static String Password="crmsfa";
	public static void main(String[] args) {
		
		ChromeDriver d=new ChromeDriver();
		d.get("http://leaftaps.com/opentaps/control/main");
		d.manage().window().maximize();
		String Title=d.getTitle();
		System.out.println(Title);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.id("usernam")).sendKeys("demosalesmanager");
		WebElement pwd=d.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		d.findElement(By.className("decorativeSubmit")).click();
		d.findElement(By.partialLinkText("CRM")).click();
		
		if(Password=="crmsfa")
		{
			System.out.println("Password is Correct");
		}
		else
		{
			System.out.println("Password is Incorrect");
			
		}
		
		
		

	}

}
