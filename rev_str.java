import java.util.Scanner;


public class rev_str {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.reverse());
	}

}
