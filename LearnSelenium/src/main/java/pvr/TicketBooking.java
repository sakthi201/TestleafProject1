package pvr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TicketBooking {

	public static void main(String[] args) {
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.pvrcinemas.com/");
		d.manage().window().maximize();
		String Title=d.getTitle();
		System.out.println(Title);
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		
		WebElement Theatre=d.findElement(By.id("cinema"));
		Theatre.click();
		
		WebElement Date=d.findElement(By.id("date"));
		Date.click();
		
		WebElement Movie=d.findElement(By.id("movie"));
		Movie.click();
		
		WebElement Timing=d.findElement(By.id("time"));
		Timing.click();
		
		 d.findElement(By.xpath("//button[@type='submit']")).click();
		//WebElement p=d.findElement(By.xpath(""));
		//Select r=new Select(p);
		//r.selectByIndex(0);
		
		// WebElement Movie=d.findElement(By.xpath("(//div[@class='p-hidden-accessible p-dropdown-hidden-select']/following::select)[3]"));
	     //Select u=new Select(Movie);
	    // u.selectByIndex(0);
		
	   // d.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}
}


