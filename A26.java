class A26 
{
	public static void main(String[] args) 
	{
		String a="sh67jk",a1="";
		int b=a.length()-1;
		while (b!=-1)
		{
			char ch=a.charAt(b);
			if (ch>='0' &&ch<='9')
			{
				a1=a1+ch;
			}
			b--;
		}
		System.out.println(a1);

	}
}
