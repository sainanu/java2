class A27 
{
	public static void main(String[] args) 
	{
		String a="adsfg",a1="";
		int b=a.length()-1;
		while (b!=-1)
		{
			char ch=a.charAt(b);
			a1=a1+ch;
			b--;
		}
		System.out.println(a1);
	}
}
