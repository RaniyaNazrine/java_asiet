import java.util.*;
class employee
{
	String Name;
	int Age;
	Long Phone_Number;
	String Address;
	double salary;
	void printsalary()
	{
		System.out.println(" The salary of the employee is : "+salary);
	}
}
class Officer extends employee
{
	String specialization;
	String department;
}
class Manager extends employee
{
	String specialization;
	String department;
}
class data
{
	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		Officer of = new Officer();
		Manager ma = new Manager();
		System.out.println("Enter the name of the officer: ");
		of.Name = s1.nextLine();
		System.out.println("Enter the age of the officer: ");
		of.Age = s1.nextInt();
		System.out.println("Enter the phone number of the officer: ");
		of.Phone_Number = s1.nextLong();
		System.out.println("Enter the address of the officer: ");
		of.Address = s1.next();
		System.out.println("Enter the salary of the officer: ");
		of.salary = s1.nextDouble();
		System.out.println("Enter the specialization: ");
		of.specialization = s1.next();
		System.out.println("Enter the department: ");
		of.department = s1.next();
		System.out.println("Enter the name of the manager: ");
		ma.Name = s1.next();
		System.out.println("Enter the age of the manager: ");
		ma.Age = s1.nextInt();
		System.out.println("Enter the phone number of the manager: ");
		ma.Phone_Number = s1.nextLong();
		System.out.println("Enter the address of the manager: ");
		ma.Address = s1.next();
		System.out.println("Enter the salary of the manager: ");
		ma.salary = s1.nextDouble();
		System.out.println("Enter the specialization: ");
		ma.specialization = s1.next();
		System.out.println("Enter the department: ");
		ma.department = s1.next();
		System.out.println("The details of the Officer ");
		System.out.println("Name: "+of.Name);
		System.out.println("Age: "+of.Age);
		System.out.println("Phone Number: "+of.Phone_Number);
		System.out.println("Address: "+of.Address);
		of.printsalary();
		System.out.println("Specialization: "+of.specialization);
		System.out.println("Department: "+of.department);
		System.out.println("The details of the Manager ");
		System.out.println("Name: "+ma.Name);
		System.out.println("Age: "+ma.Age);
		System.out.println("Phone Number: "+ma.Phone_Number);
		System.out.println("Address: "+ma.Address);
		ma.printsalary();
		System.out.println("Specialization: "+ma.specialization);
		System.out.println("Department: "+ma.department);
	}
}
