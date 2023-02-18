class A11 
{
	public static void main(String[] args) 
	{
		String a="ghdvs";
		char a1='d';
		int b=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (a1==ch)
			{
				System.out.print(b);
			}
			b++;
		}
	}
}
