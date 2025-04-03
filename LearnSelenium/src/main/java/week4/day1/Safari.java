package week4.day1;

public class Safari extends Browser {

	
		
		public void readerMode()
		{
			System.out.println("Reader is opened");
		}
		
		public void FullScreenMode()
		{
			System.out.println("FullScreen is opened");
		}
		
		public static void main(String[] args) {
			
			Safari T=new Safari();
			T.openurl();
			T.closeurl();
			T.FullScreenMode();
					

	}

}
