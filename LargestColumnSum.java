package hello;

public class LargestColumnSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[][]arr = {{1,4,5},{2,4,3},{6,9,2}};
			int row = arr.length;
			int col = arr[0].length;
			int sum = 0,max = Integer.MIN_VALUE,k = 0;
			
			for(int j = 0;j < col;j++)
			{
				sum = 0;
				for(int i = 0;i < row;i++)
				{
					sum += arr[i][j];
				}
				System.out.println(sum);
				if(sum > max)
				{
					max = sum;
					k = j;
				}
			}
			
			System.out.println(max + " " + k);
	}

}
