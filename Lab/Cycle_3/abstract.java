abstract class shape
{
	void numberOfSides()
	{
	
	}
}
class Rectangle extends shape
{
	void numberOfSide()
	{
		System.out.println("The number of side of Rectangle is 4");
	}
}
class Triangle extends shape
{
	void numberOfSide()
	{
		System.out.println("The number of side of Triangle is 3");
	}
}
class Hexagon extends shape
{
	void numberOfSide()
	{
		System.out.println("The number of sided of hexagon is 6");
	}
}
class demo
{
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		Hexagon hex = new Hexagon();
		rec.numberOfSide();
		tri.numberOfSide();
		hex.numberOfSide();
	}
}
