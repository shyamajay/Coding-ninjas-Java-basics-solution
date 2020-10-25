package sort;

import java.util.Scanner;

public class RotateArray2 {

	public static int[]RotateMethod2(int[]arr,int d)
	{
		int x[] = new int[d];
		int k = 0;
		for(int i=0;i<d;i++)
		{
			x[i]=arr[i];
		}
		int n = arr.length;
		for(int i = 0;i < n-d;i++)
		{
			arr[i]=arr[i+d];
		}
		
		while(d > 0)
		{
			arr[n-d]=x[k];
			k++;
			d--;
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
		int arr[] = {2,6,3,1,5,9,8};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of bits the array to be rotated");
		int d = s.nextInt();
		arr = RotateMethod2(arr,d);
		print(arr);
	}

}
