class A21 
{
	public static void main(String[] args) 
	{
		String a="cjavjh",a1="";
		char c='j';
		int d=0,b=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (ch==c)
			{
				d++;
			}
			if (d!=1 || ch!=c)
			{
				a1=a1+ch;
			}
			b++;
		}
		System.out.println(a1);
	}
}
