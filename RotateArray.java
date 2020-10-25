package sort;

import java.util.Scanner;

public class RotateArray {

	public static int[]Rotate(int[]arr,int d)
	{
		int k = 0;
		int n = arr.length;
		while(k<d)
		{
			int temp = arr[0];
			for(int i = 0;i < n-1;i++)
			{
				arr[i] = arr[i+1];
			}
			arr[n-1]=temp;
			k++;
			temp = 0;
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
		arr = Rotate(arr,d);
		print(arr);
	}

}
