package week4.day1;



public class Browser {
	String Name="Chrome";
	double version=3.3;
	
	
	
	
	public void openurl()
	{
		System.out.println("open the browser");
		System.out.println("The Name of the Browser is:"+Name);
		System.out.println("The Versiob is:"+version);
		
	}
	public void closeurl()
	{
		System.out.println("Close the browser");
	}
	public void navigateBack()
	{
		System.out.println("Navigate to next Browser");
	}
	
	public static void main(String[] args) {
		
		Browser g=new Browser();
		g.openurl();
		
	}

		
	
}


