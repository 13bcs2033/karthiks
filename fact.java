import java.util.Scanner;

public class fact 
{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i,fact=1;
		for(i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println(fact);

	}

}
