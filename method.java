class method 
{
	String a="vjchsb";
	int b=90;
	boolean c=true;
	double d=9.89;
	public void m1()
	{
		System.out.println("Non-Static Method");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	method(String a,int b)
	{
		this.a=a;
		this.b=b;
	}
	method(boolean c,double d)
	{
		this.c=c;
		this.d=d;
	}
	method()
	{
		System.out.println("EMPTY CONSTRUCTOR");
	}
	public static void main(String[] args) 
	{
		method a1=new method();
		a1.m1();
		method b1= new method("sai",90);
		b1.m1();
		method c= new method(true,89.89);
		c.m1();
	}
}
