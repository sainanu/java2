class  A14
{
	public static void main(String[] args) 
	{
		String z="magnumumu";
		String y="";
		int l=z.length()-1;
		for (int i=0;i<=l ;i++ )
		{
			char ch=z.charAt(i);
			int n=y.length()-1;
			boolean f=false;
			for (int j=0;j<=n ;j++ )
			{
				char ch1=y.charAt(j);
				if (ch==ch1)
				{
					f=true;
					break;
				}
			}
			if(f==false)
			{
				y=y+ch;
			}
		}
		char ch2=y.charAt(0);
		int maxcount =0;
		for (int i=0;i<=y.length()-1 ;i++ )
		{
			int c=0;
			char ch=y.charAt(i);
			for (int j=0;j<=z.length()-1 ;j++ )
			{
				char ch1=z.charAt(j);
				if (ch==ch1)
				{
					c++;
				}
			}
			if (c>maxcount)
			{
				maxcount=c;
				ch2=ch;
			}
		}
		System.out.println(ch2);
	}
}