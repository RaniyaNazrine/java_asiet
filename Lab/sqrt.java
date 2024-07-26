import java.lang.*;
import java.util.*;
class sqrt
{
	public static void main(String args[])
	{
		double a,b,c,pow,sqrt;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number to find root of the number:");
		a=s1.nextDouble();
		sqrt=Math.sqrt(a);
		System.out.println("The root of "+a+" is:"+sqrt);
		System.out.println("Enter the two numbers to find power of the number:");
		b=s1.nextDouble();
		c=s1.nextDouble();
		pow=Math.pow(b,c);
		System.out.println("The " +c+ " power of "+b+" is:"+pow);
		s1.close();
	}
}
