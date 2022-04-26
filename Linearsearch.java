package java;


public class Linearsearch {
	public static int linear(int arr[], int elem)
	{
		for(int i=0;i<arr.length;i++ )
			if(arr[i]==elem)
		{
			System.out.println("The Element is found");
		}
			else
			{
		      System.out.println("The Element is not found");
			}
		 return elem;
	}
  
	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6};
		System.out.println(linear(arr,3));
		

	}

}
