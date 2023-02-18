class A15
{
	public static void main(String[] args)
	{
		String s="abababbccm";
		String res="";
		for (int i=0;i<s.length() ;i++ )
		{
			char ch=s.charAt(i);
			 boolean f= false;
			for (int j=0;j<res.length() ;j++ )
			{
				char ch1=res.charAt(j);
				if(ch==ch1)
				{
					f=true;
					break;
				}
			}
			if(f==false)
			{
				res=res+ch;
			}
	    }
		char ch2=res.charAt(0);
			int maxc =0;
		for (int k=0;k<res.length() ;k++ )
		{
			char ch3=res.charAt(k);
		    int c=0;
			for (int j=0;j<s.length() ;j++ )
			{
				char ch4=s.charAt(j);
				if(ch3==ch4)
				{
                    c++;
				}
				else{
					maxc++;
				}
			}
			if(c<maxc)
		   {
             maxc=c;
			 ch2=ch3;
		   }
		}
		
		System.out.println(ch2);
	}
	
}