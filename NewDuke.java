class Duke
{
	public  void m1()
	{
		System.out.println("WELCOME TO DUKE");
		System.out.println("VROOM VROOM");
	}
}  
class KTM extends Duke
{
	public void m1()
	{
		super.m1();
		System.out.println("ZIIT ZIIT");
	}
}
class RC200 extends KTM
{
	public  void m1()
	{
		super.m1();
		System.out.println("KII KII");
	}
} 
class NewDuke
{
	public static void main(String[] args) 
	{
		RC200 r1=new RC200();
		r1.m1();
	}
}
