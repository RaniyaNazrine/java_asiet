import java.util.*;
class avg
{
	public static void main(String args[])
	{
		float a,b,avg;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		a=s1.nextFloat();
		b=s1.nextFloat();
		avg=(a+b)/2;
		System.out.println("The avg of the numbers are:"+avg);
		s1.close();
	}
}
