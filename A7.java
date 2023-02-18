class A7 
{
	public static void main(String[] args) 
	{
		String a="bj jb bd";
		int b=0,c=1;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (ch==' ')
			{
				c++;
			}
			b++;
		}
		System.out.println(c);
	}
}
