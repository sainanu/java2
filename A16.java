class A16 
{
	public static void main(String[] args) 
	{
		String a="hvdhjcvj",a1="",a2="";
		int b=0,d2=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			int b1=0,c=0;
			while (b1!=a1.length())
			{
				char ch1=a1.charAt(b1);
				if (ch==ch1)
				{
					c++;
					break;
				}
				b1++;
			}
			if (c==0)
			{
				a1=a1+ch;
			}
			b++;
		}
		int b2=0;
		while (b2!=a1.length())
		{
			char ch2=a1.charAt(b2);
			int d=0,e1=0;
			while (d!=a.length())
			{
				char ch3=a.charAt(d);
				if (ch2==ch3)
				{
					e1++;
				}
				d++;
			}
			a2=a2+ch2+e1;
			b2++;
		}
		System.out.println(a2);
	}
}
