class A25 
{
	public static void main(String[] args) 
	{
		String a="shsbjk",a1="";
		char c='s',d='e';
		int b=a.length()-1,e=0;
		while (b!=-1)
		{
			char ch=a.charAt(b);
			if (ch==c && e<1)
			{
				e++;
				a1=a1+d;
			}
			else
			{
				a1=a1+ch;
			}
			b--;
		}
		System.out.println(a1);

	}
}
