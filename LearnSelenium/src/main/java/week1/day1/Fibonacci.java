package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
	
		int a=0;
		int b=1;
		int c;
		int count=0;
		System.out.println("Febonacci series:"+a +" "+ b);
		while(count<10)
		{
			c=a+b;
			System.out.println(""+c);
			a=b;
			b=c;
			count++;
		}

	}

}
