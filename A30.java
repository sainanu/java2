class A30
{
	public static void main(String [] args)
	{
		String a="hvdhjcvj",a1="",a2="";
		int b=0,d2=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			int b1=0;
			boolean c=false;
			while (b1!=a1.length())
			{
				char ch1=a1.charAt(b1);
				if (ch==ch1)
				{
					c=true;
					break;
				}
				b1++;
			}
			if (c==false)
			{
				a1=a1+ch;
			}
			b++;
		}
		int b2=0;
		while (b2!=a1.length())
		{
			char ch2=a1.charAt(b2);
			int b3=0;
			while (b3!=a2.length())
			{
				char ch3=a2.charAt(b3);
				if (ch2>ch3)
				{
					a2+=ch2;
				
				}
				else if (ch2<ch3)
				{
					a2=ch2+a2;
				}
				
				b3++;
			}
			b2++;
		}
		System.out.println(a2);
	}
}