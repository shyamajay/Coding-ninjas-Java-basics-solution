package hello;

public class MaximumSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "coding ninja";
		int start_index = 0,end_index = s.length()-1,count = 0;
		int min = Integer.MIN_VALUE;
		String str = "";
		
		for(int i = 0;i < s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				if(min < count)
				{
					end_index = i;
					str = s.substring(start_index, end_index);
					min = count;
				}
				start_index = i+1;
				count = 0;
			}
			else
			{
				count++;
			}
		}
		
		end_index = s.length();
		if(min < count)
		{
			str = s.substring(start_index, end_index);
		}
		System.out.println(str);

	}

}
