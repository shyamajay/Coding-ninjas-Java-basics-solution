package pattern;
import java.util.Scanner;
public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int i=1,j;
		
		while(i<=n)
		{
			char ch =(char)('A'+i-1);
			j=1;
			while(j<=n)
			{
				System.out.print(ch);
				ch += 1;
				j += 1;
			}
			
			System.out.println();
			i += 1;
		}
	}

}
