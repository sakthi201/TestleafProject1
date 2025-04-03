package week6;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeDriver d=new ChromeDriver();
		d.get("https://erail.in/");
		d.manage().window().maximize();
		String Title=d.getTitle();
		System.out.println(Title);
		//d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Stationfrom=d.findElement(By.id("txtStationFrom"));
		Stationfrom.clear();
		Stationfrom.sendKeys("MAS",Keys.ENTER);
		
		WebElement StationTo=d.findElement(By.id("txtStationTo"));
		StationTo.clear();
		StationTo.sendKeys("MDU",Keys.ENTER);
	
		d.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> List1=d.findElements(By.xpath("//table[contains(@class,'TrainList')]/tbody/tr/td[2]"));
		System.out.println("Result Count:"+List1.size());
		System.out.println("Train Names:");
		for(WebElement Train:List1)
		{
			System.out.println(Train.getText());
		}

	}

}
