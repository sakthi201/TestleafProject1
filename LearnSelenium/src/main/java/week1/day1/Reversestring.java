package week1.day1;

public class Reversestring {

	public static void main(String[] args) {
		
		String k="SakthiAnand";
		String reverse="";
		char r;
		for(int i=k.length()-1;i>=0;i--)
		{
			r=k.charAt(i);
			reverse=reverse+r;
		}
		System.out.println("The Reversed word is:"+reverse);
	}

}