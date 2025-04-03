package week5;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLinks {

	public static void main(String[] args) {
		
		//login
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//search
		WebElement SearchBox=d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchBox.sendKeys("Iphone");
		SearchBox.submit();
		
		List<WebElement> Prices= d.findElements(By.className("a-price-whole"));
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
