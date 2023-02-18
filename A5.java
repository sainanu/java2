class A5 
{
	public static void main(String[] args) 
	{
		String a="AJVbdh",a1="";
		int b=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (ch>='A'&&ch<='Z')
			{
				ch+=32;
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
