class Summing 
{
	public static int m1(int b)
	{
		int a=b;
		int sum=0;
		while (a!=0)
		{
			int c=a%10;
			sum+=c;
			a/=10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int a=9989;
		while (m1(a)>9)
		{
			a=m1(a);
			m1(a);
		}
		System.out.println(m1(a));
	}
}