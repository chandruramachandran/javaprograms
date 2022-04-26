package aaa;

public class Binarysearch {
	public static int Binary(int arr[], int ele) {
		int s= 0;
		int e= arr.length-1;
		while(s<=e)
		{
		 int mid = (s+e)/2;
		 if(ele<=arr[mid])
		 {
			 e=mid-1;
		 }
		 else if(ele>=arr[mid])
		 {
			 s= mid+1;
		 }
		 else
		 {
			 return mid;
		 }
		}
		return ele;
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50,60};
		System.out.println(Binary(arr,20));

	}

}
