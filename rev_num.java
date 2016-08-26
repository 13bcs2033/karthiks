import java.util.Scanner;


public class rev_num {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i1=sc.nextInt();
		String s=String.valueOf(i1);
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
	}

}
