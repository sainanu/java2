class recursion 
{
	public static int m1(int a)
	{
		int b=a;
		int sum=0;
		while (b!=0)
		{
			int c=b%10;
			sum+=c;
			c/=10;
			System.out.println(sum);
		}
	}
	public static void main(String[] args) 
	{
		m1(9989);
	}
}
