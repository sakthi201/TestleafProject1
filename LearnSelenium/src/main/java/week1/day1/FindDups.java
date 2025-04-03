package week1.day1;

public class FindDups {

	public static void main(String[] args) {
		int arr[]= {2,5,7,7,5,9,2,3};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The Duplicate Value is:"+arr[i]);
				}
			}
		}

		
	

	}

}
