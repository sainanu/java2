class A20 
{
	public static void main(String[] args) 
	{
		String a="ahcg",a1="";
		int b=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (b!=0 && b!=a.length()-1)
			{
				a1=a1+ch;
			}
			b++;
		}
		System.out.println(a1);
	}
}
