class A4 
{
	public static void main(String[] args) 
	{
		String a="AJVbdh",a1="";
		int b=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (ch>='a'&&ch<='z')
			{
				ch-=32;
				a1+=ch;
			}
			else
			{
				a1+=ch;
			}
			b++;
		}
		System.out.println(a1);
	}
}
