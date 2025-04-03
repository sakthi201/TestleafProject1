package tatacliq;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Watches {

	public static void main(String[] args) throws InterruptedException {
		
//Launch the browser
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.tatacliq.com/");
		d.manage().window().maximize();
//Title
		String Title=d.getTitle();
		System.out.println(Title);
//Timeouts
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//Search Box
	    WebElement search=d.findElement(By.id("search-text-input"));
	    Thread.sleep(2000);
	    search.sendKeys("Fasttrack Watches for Women",Keys.ENTER);
//Print the Result
	    String Result = d.findElement(By.className("Plp__plpHeading")).getText();
	    System.out.println("Result After Search:"+Result);
//DropDown
	    WebElement Dropdown=d.findElement(By.className("SelectBoxDesktop__hideSelect"));
	    Select catagory=new Select(Dropdown);
	    catagory.selectByVisibleText("New Arrivals");
//List
	    
	    List<WebElement> Prices= d.findElements(By.className("ProductDescription__boldText"));
		List<Integer> list=new ArrayList<Integer>();
		
		for (WebElement PriceName:Prices)
		{
			
			String name=PriceName.getText();
			String replaceAll=name.replaceAll(",", "");
			int k=Integer.parseInt(replaceAll);
			
			
			list.add(k);
			
		}
		
		
		System.out.println(list);
	      

	}

}
