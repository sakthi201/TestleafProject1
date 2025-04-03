package week5;

public class LearnMethodOverloading {

	      public void reportstep()
	      {
	    	  
	    	  String Message="Meeting has been arranged";
	    	  String Status="within in 1 hour";
	    	  System.out.println("Message:"+Message);
	    	  System.out.println("Status:"+Status);
	      }
	      
		public void reportstep(String Team,String Manager) 
		
		{
			System.out.println("Message:"+Team);
			System.out.println("Status:"+Manager);
			
		}
			public static void main(String args[])
			{
				LearnMethodOverloading ms=new LearnMethodOverloading();
				ms.reportstep();
				ms.reportstep("joined","Successful");
				
			}
		
		

	}

	


