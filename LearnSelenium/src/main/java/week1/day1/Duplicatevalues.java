package week1.day1;

public class Duplicatevalues {

	public static void main(String[] args) {
		int arr[]= {1,2,2,4,4,8,9,10};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("The Duplicate Element found is:"+arr[i]);
				}
			}
		}

		
	

	}

}
