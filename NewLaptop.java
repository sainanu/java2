abstract class Laptop
{
	String ram;
	String rom;
	int price;
	String color;
	String company;
	Laptop(String ram,String rom,int price,String color,String company)
	{
		this.ram=ram;
		this.rom=rom;
		this.price=price;
		this.color=color;
		this.company=company;
	}
	abstract public void m1();
	abstract public void m2();
	abstract public void m3();
}
class Laptop1 extends Laptop
{
	Laptop1(String ram,String rom,int price,String color,String company)
	{
		super(ram,rom,price,color,company);
	}
	public  void m1()
	{
		System.out.println(this.ram);
		System.out.println(this.rom);
		System.out.println(this.price);
	}
	public  void m2()
	{
		System.out.println(this.color);
	}
	public  void m3()
	{
		System.out.println(this.company);
		System.out.println("____________________");
	}
}
class Laptop2 extends Laptop
{
	Laptop2(String ram,String rom,int price,String color,String company)
	{
		super(ram,rom,price,color,company);
	}
	public  void m1()
	{
		System.out.println(this.ram);
		System.out.println(this.rom);
		System.out.println(this.price);
	}
	public  void m2()
	{
		System.out.println(this.color);
	}
	public  void m3()
	{
		System.out.println(this.company);
		System.out.println("____________________");
	}
}

class NewLaptop 
{
	public static void main(String[] args) 
	{
		Laptop1 l1=new Laptop1("4GB","16GB",40000,"red","LG");
		l1.m1();
		l1.m2();
		l1.m3();
		Laptop2 l2=new Laptop2("6GB","32GB",80000,"black","HP");
		l2.m1();
		l2.m2();
		l2.m3();
	}
}