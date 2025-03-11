package week1.day1;

public class Armstrongnumber {

	public static void main(String[] args) {
	
		int num=153;
		int temp=num;
		int rem;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		System.out.println("The value is:"+sum);
		if(temp==sum) 
		{
			System.out.println("It is a Armstorng Number");
		}
		else
		{
			System.out.println("It is not a Armstorng Number");
		}

	}

}
