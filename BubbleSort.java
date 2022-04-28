package app;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		int n=arr.length-1;
		boolean flag=false;
		int count=0;
		for(int i=0;i<n;i++)
		{
			int pointer=0;
			for(int j=1;j<=n-i;j++)
			{
				if(arr[pointer]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[pointer];
					arr[pointer]=temp;
					flag=true;
				}
				pointer++;
			}
			count++;
			if(!flag)
			{
				break;
			}
		}
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
	}
}