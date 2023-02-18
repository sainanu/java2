class A1 
{
	public static void main(String[] args) 
	{
		String a="abcd90";
		int b=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			System.out.println(ch);
			b++;
		}
	}
}
