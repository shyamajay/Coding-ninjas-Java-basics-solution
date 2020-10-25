package sort;

public class Sort012 {

	public static void approach2(int[]arr)
	{
		int arr1[];
		int n = arr.length;
		arr1 = new int[n];
		int start = 0,end = n-1;
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i] == 0)
			{
				arr1[start] = arr[i];
				start++;
			}
			
			else if(arr[i] == 2)
			{
				arr1[end] = arr[i];
				--end;
			}
			
			else
			{
				continue;
			}
		}
		
		System.out.println(start);
		System.out.println(end);
		
		for(int i = start;i <= end;i++)
		{
			arr1[i] = 1;
		}
		
		for(int i = 0;i < n;i++)
		{
			System.out.print(arr1[i]);
		}
	}
	
	public static void approach1(int[]arr)
	{
		int n = arr.length;
		int i = 0,nz = 0,nt = n-1;
		
		for(i = 0;i <= n/2;)
		{
			if(arr[i] == 0)
			{
				int temp = arr[nz];
				arr[nz] = arr[i];
				arr[i] = temp;
				++nz;
				++i;
			}
			
			else if(arr[i] == 2)
			{
				int temp1 = arr[i];
				arr[i] = arr[nt];
				arr[nt] = temp1;
				--nt;
			}
			
			else
			{
				if(arr[i]==1)
				i++;
			}
		}
		
		for(i = 0;i < n;i++)
			System.out.print(arr[i] + " ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,2,1,0,1,1,0};
		approach2(arr);
		//approach1(arr);
	}

}
