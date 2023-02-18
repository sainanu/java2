class A17 
{
	public static void main(String[] args) 
	{
		String a="aba";
		String a1=a;
		String c="";
		int b1=0;
		while (b1!=a.length())
		{
			char ch=a.charAt(b1);
			c=ch+c;
			b1++;
		}
		System.out.println(a1);
		System.out.println(c);
		if (a1==c)
		{
			System.out.print("Palindrome");
		}
	}
}
