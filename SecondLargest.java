package sort;

public class SecondLargest {

	public static int Largest(int[]arr)
	{
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i] > largest)
			{
				largest = arr[i];
			}
		}
		
		return largest;
	}
	
	public static void SecondMax(int[]arr,int largest)
	{
		int min = Integer.MIN_VALUE;
		
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i] > min && largest != min && arr[i]!= largest)
			{
				min = arr[i];
			}
		}
		
		System.out.println(min);
	}
	public static void Approach2(int[]arr)
	{
		int largest = Integer.MIN_VALUE;
		int Second_largest = Integer.MIN_VALUE;
		
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i] > largest)
			{
				Second_largest = largest;
				largest = arr[i];
			}
			else if(arr[i] > Second_largest && arr[i] != largest)
				{
					Second_largest = arr[i];
				}
		}
		
		System.out.println(Second_largest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,2,2,2};
		//int largest = Largest(arr);
		//SecondMax(arr,largest);
		Approach2(arr);
	}

}
