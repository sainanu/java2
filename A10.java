class A10 
{
	public static void main(String[] args) 
	{
		String a="bvkjfvjk";
		int b=0,c=0;
		char c2='v';
		while (b!=a.length())
		{
			char c1=a.charAt(b);
			if (c2==c1)
			{
				c++;
			}
			b++;
		}
		System.out.println(c);
	}
}
