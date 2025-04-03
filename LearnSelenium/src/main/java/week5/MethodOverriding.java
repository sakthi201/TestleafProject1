package week5;

public class MethodOverriding extends LearnMethodOverloading {

	
		
		public void reportstep()
	      {
			
			String Message="Meeting Started";
	    	  String Status="Everyone joined in the meeting";
	    	  System.out.println("Message:"+Message);
	    	  System.out.println("Status:"+Status);
	      }

	    	  public static void main(String args[])
				{
	    		  MethodOverriding m=new MethodOverriding();
					m.reportstep();

	}

}
