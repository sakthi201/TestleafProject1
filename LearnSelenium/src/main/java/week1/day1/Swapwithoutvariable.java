package week1.day1;

public class Swapwithoutvariable {

	public static void main(String[] args) {
		
		int a=600;
		int b=5000;
		System.out.println("Before Swap:"+a);
		System.out.println("Before Swap:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap:"+a);
		System.out.println("After Swap:"+b);
		
		

	}

}
