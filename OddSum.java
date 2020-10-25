package pattern;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1,j,m=1;
		
		while(i<=n)
		{
			j = 1;
			while(j<=n-i+1)
			{
				if(m%2 != 0)
				{
					System.out.print(m);
					j++;
				}
				m++;
			}
			
			int h = 1,k = 1;
			while(k<i)
			{
				System.out.print(h);
				h+=2;
				k+=1;
			}
			
			System.out.println();
			m = i*2;
			i += 1;
		}

	}

}
