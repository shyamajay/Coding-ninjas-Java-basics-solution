package pattern;

import java.util.Scanner;

public class HalfDiamond {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1,j;
		int mid = n;
		
		System.out.println('*');
		
		while(i<=mid)
		{
			System.out.print('*');
			
			j=1;
			while(j<=i)
			{
				System.out.print(j);
				j += 1;
			}
			
			int k = i-1;
			while(k>=1)
			{
				System.out.print(k);
				k -= 1;
			}
			
			System.out.print('*');
			System.out.println();
			i += 1;
		}
		
		i=1;
		while(i<mid)
		{
			System.out.print('*');
			
			j=1;
			while(j<=mid-i)
			{
				System.out.print(j);
				j += 1;
			}
			
			int k = mid-i-1;
			while(k>=1)
			{
				System.out.print(k);
				k -= 1;
			}
			
			System.out.print('*');
			System.out.println();
			i += 1;
		}
		System.out.println('*');
	}

}
