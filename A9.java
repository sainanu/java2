class  A9
{
	public static void main(String[] args) 
	{
		String a="abcd";
		int b=0,c=0,d=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (ch>='a'&&ch<='z' || ch>='A'&&ch<='Z')
			{
				if (ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
				{
					c++;
				}
				else
				{
					d++;
				}
			}
			b++;
		}
		System.out.println(c);
		System.out.println(d);
	}
}
