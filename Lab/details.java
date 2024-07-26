import java.util.*;
class details
{
	public static void main(String args[])
	{
		int c;
		String a,b;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Name:");
		a=s1.nextLine();
		System.out.println("Enter your Class:");
		b=s1.nextLine();
		System.out.println("Enter your Roll No:");
		c=s1.nextInt();
		System.out.println("Name: " +a);
		System.out.println("Class:" +b);
		System.out.println("Roll no:" +c);
	}
}
