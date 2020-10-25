package pattern;

import java.util.Scanner;

public class SumPattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1,j;
		System.out.println(i + "=" + i);
		while(i<n)
		{
			int sum = 0;
			j = 1;
			while(j<=i)
			{
				System.out.print(j + "+");
				sum += j;
				j += 1;
			}
			sum += j;
			System.out.println(j + "=" + sum);
			i += 1;
		}
	}

}
