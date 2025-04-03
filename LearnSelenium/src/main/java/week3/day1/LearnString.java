package week3.day1;

public class LearnString {

	public static void main(String[] args) {
	
		String name="SakthiAnand";
		String name1="Sakthianand";
		String str="TestLeaf";
		String str1="TestLeaf";
	//length	
		int length=name.length();
		System.out.println(length);
		int word=name1.length();
		System.out.println(word);
		int value=str.length();
		System.out.println(value);
		int rate=str1.length();
		System.out.println(rate);
		
		//compare two
		
		boolean equals=str.equals(name);

		System.out.println(equals);
		
		if(str.equals(str1))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
        if(name==name1)
        {
        	System.out.println("Same");
        	
        }
        else
        {
        	System.out.println("Not Same");
        }
        
        boolean k=name.equalsIgnoreCase(name1);
        System.out.println(k);
        
        
        
      char[] l=name.toCharArray();
      
      System.out.println(l);
      
      for(int i=0;i<l.length;i++)
      {
    	  System.out.println(l);
      }
        
      
      char r=str.charAt(4);
      System.out.println(r);
      
      //Replace
      String j="Sakthi@123";
      String replace=j.replace("t", "T");
      System.out.println(replace);
        
       //retrieve
      
      String B=j.replaceAll("[^0-9]","");
      System.out.println(B);
      
      String o=j.replaceAll("[^A-z]","");
      System.out.println(o);
      
      //String to int
      
      String w="1234";
      int y=Integer.parseInt(w);
      System.out.println(y+100);
      
      //split
      
      String h="Testleaf and eagle";
      String[] split=h.split("ea");
      System.out.println(split[2]);
      
      String[] split2=h.split("");
      System.out.println(split2[1]);
      
      
     //Sub String
      
      String dd="April";
      String sub=dd.substring(2);
      System.out.println(sub);
      
      String p=dd.substring(1,3);
      
      System.out.println(p);
        
        
        
	}

}
