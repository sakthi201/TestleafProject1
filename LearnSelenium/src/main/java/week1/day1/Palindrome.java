package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
	
		int num=151;
		int temp = num;
		int rem;
		int rev=0;
		while(num!=0) 
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse:"+rev);
	
		if(temp==rev)
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}

	}

}
