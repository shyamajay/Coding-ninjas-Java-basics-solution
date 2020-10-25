package sort;

import java.util.Scanner;

public class RotateArray3 {

	public static int[]RotateMethod3(int[]arr,int d)
	{
		int n = arr.length;
		for(int i = 0;i < (n-d+1)/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[n-d-i-1];
			arr[n-d-i-1] = temp;
		}
		
		int k = 0,j=1;
		while(d/2 > 0)
		{
			int temp = arr[n-d];
			arr[n-d] = arr[n-k-1];
			arr[n-k-1] = temp;
			d--;
			j++;
			k++;
		}
		
		return arr;
	}
	
	public static int[]Reverse(int[]arr,int n)
	{
		for(int i = 0;i<n/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[n-i-1];
			arr[n-i-1] = temp;
		}
		return arr;
	}
	
	public static void print(int[]arr)
	{
		for(int i = 0;i < arr.length;i++)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,6,3,1,5,9,8,10};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of bits the array to be rotated");
		int d = s.nextInt();
		int n = arr.length;
		arr = Reverse(arr,n);
		arr = RotateMethod3(arr,d);
		print(arr);
	}

}
