class mO2 
{
	String a;
	int b;
	boolean c;
	double d;
	public void m1()
	{
		System.out.println("Non-Static Method");
		System.out.println(a);
		System.out.println(b);
	}
	mO2(String a,String b,int c)
	{
		this.a=a;
		this.b=c;
	}
	mO2()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		mO2 a=new mO2();
		mO2 b=new mO2("abc","fgh",90);
		b.m1();
	}
}
