interface A 
{
	String a="10";
	static int b=20;
	public static void m1()
	{
		System.out.println("M1");
	}
	public void m2();
}
class Interface 
{
	public static void main(String[] args) 
	{
		A.m1();
		System.out.println(A.a);
		System.out.println(A.b);
	}
}
