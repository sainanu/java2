class A19 
{
	public static void main(String[] args) 
	{
		String a="ahhhj",a2="";
		char a1='h';
		int b=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (a1!=ch)
			{
				a2=a2+ch;
			}
			b++;
		}
		System.out.println(a2);
	}
}
