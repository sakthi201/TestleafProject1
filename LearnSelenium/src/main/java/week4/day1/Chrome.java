package week4.day1;

public class Chrome extends Browser{
	
	
	public void OpenIncognito()
	{
		System.out.println("Incognito is opened");
	}
	
	public void ClearCache()
	{
		System.out.println("Cache is Cleared");
	}
	

	public static void main(String[] args) {
		
		Chrome r=new Chrome();
		
		
		r.OpenIncognito();
		r.openurl();
		r.closeurl();
		
		
		
		
		

	}

}
