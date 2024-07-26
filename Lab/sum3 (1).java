import java.util.*;
class sum
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the three numbers:");
		a=s1.nextInt();
		b=s1.nextInt();
		c=s1.nextInt();
		int sum=a+b+c;
		System.out.println("The Sum of the given 3 numbers is:"+sum);
		s1.close();
	}
}
