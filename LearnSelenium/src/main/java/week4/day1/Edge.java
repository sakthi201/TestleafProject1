package week4.day1;

public class Edge extends Chrome {


		public void takesnap()
		{
			System.out.println("Snap is Taken");
		}
		
		public void ClearCookies()
		{
			System.out.println("Cookies is cleared");
		}
		
		

		public static void main(String[] args) {
			
			Edge k=new Edge();
			k.ClearCache();
			k.takesnap();
			
			
			

	}

}
