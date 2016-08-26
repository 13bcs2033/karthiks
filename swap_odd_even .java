import java.util.Scanner;


public class swap_odd_even 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.next();
		
		String s1,s;
		s1=s="";
		char c[]=str.toCharArray();
		for(int i=0;i<str.length();i+=2)
		{
			
			s1+=c[i];
		
		}
		for(int i=1;i<str.length();i+=2)
		{
			s+=c[i];
		
		}
		System.out.print(s1+" "+s);

	}

}
