class A13 
{
	public static void main(String[] args) 
	{
		String a="hvhhkk";
		char a1='h';
		int b=a.length()-1;
		while (b!=-1)
		{
			char ch=a.charAt(b);
			if (a1==ch)
			{
				System.out.println(b);
				break;
			}
			b--;
		}
	}
}
