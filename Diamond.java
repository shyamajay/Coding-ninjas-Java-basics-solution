package pattern;
import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=1,j;
		int mid = n/2+1;
		while(i<=mid)
		{
			int space=1;
			while(space <= mid-i)
			{
				System.out.print(" ");
				space += 1;
			}
			j=1;
			while(j<=i)
			{
				System.out.print('*');
				j += 1;
			}
			int k=i-1;
			while(k>=1)
			{
				System.out.print('*');
				k-=1;
			}
			
			System.out.println();
			i+=1;
			
		}
		
		i=1;
		while(i<=mid-1)
		{
			int space=1;
			while(space <= i)
			{
				System.out.print(" ");
				space += 1;
			}
			j=1;
			while(j<=mid-i)
			{
				System.out.print('*');
				j += 1;
			}
			int k=mid-i;
			while(k>1)
			{
				System.out.print('*');
				k-=1;
			}
			
			System.out.println();
			i+=1;
			
		}

	}

}
