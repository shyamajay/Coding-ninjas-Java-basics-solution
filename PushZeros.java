package sort;

public class PushZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,6,0,0,1,9,0,8,0};
		int n = arr.length;
		int k = 0;
		
		for(int i = 0;i < n;i++)
		{
			if(arr[i] != 0)
			{
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				k++;
			}
		}
		
		for(int i = 0;i < n;i++)
			System.out.print(arr[i] + " ");

	}

}
