class A24 
{
	public static void main(String[] args) 
	{
		String a="shsbjk",a1="";
		char c='s',d='e';
		int b=0,e=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (ch==c && e<1)
			{
				e++;
				a1=a1+d;
			}
			else
			{
				a1=a1+ch;
			}
			b++;
		}
		System.out.println(a1);

	}
}
