class A8 
{
	public static void main(String[] args) 
	{
		String a="abA@%123";
		int b=0,c=0,d=0,e=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
			{
				c++;
			}
			else if (ch>='0'&&ch<='9')
			{
				d++;
			}
			else
			{
				e++;
			}
			b++;
		}
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
}
