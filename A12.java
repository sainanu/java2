class A12 
{
	public static void main(String[] args) 
	{
		String a="ghhnjkn";
		char a1='h';
		int b=0;
		while (b!=a.length())
		{
			char ch=a.charAt(b);
			if (a1==ch)
			{
				System.out.println(b);
				break;
			}
			b++;
		}
	}
}
