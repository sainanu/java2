class A23 
{
	public static void main(String[] args) 
	{
		String a="bj vjh",a1="";
		char c=' ';
		int b=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (ch!=c)
			{
				a1=a1+ch;
			}
			b++;
		}
		System.out.println(a1);
	}
}
