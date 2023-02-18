import java.util.*;
class Dominos
{
	static String a="Domino's";
	static String b="Estd.!960";
	static String c="c)Veg-Pizza: 250";
	static String d="d)Paneer-Pizza: 350";
	static String e="e)Corn-Pizza: 450";
	static String f="f)Mutton-Pizza: 600";
	static String g="g)Chicken-Pizza: 550";
	static String s="";
	public static void aboutUs()
	{
		System.out.println(a);
		System.out.println(b);
	}
	public static void menu()
	{
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);

	}
	public static void a1()
	{
		Scanner scan =new Scanner(System.in);
		String a=scan.nextLine();
		int b=0;
		while (b<a.length())
		{
			char ch=a.charAt(b);
			switch (ch)
			{
			case 'c':
				System.out.println(c);
				s+=c;
				break;
			case 'd':
				System.out.println(d);
				s+=d;
				break;
			case 'e':
				System.out.println(e);
				s+=e;
				break;
			case 'f':
				System.out.println(f);
				s+=f;
				break;
			case 'g':
				System.out.println(g);
				s+=g;
				break;
			}
			b++;
		}
	}
	public static void total()
	{
		String c=s,d="";
		int b=0;
		int d1=0;
		while (b<c.length())
		{
			char ch=c.charAt(b);
			if (ch>='0' && ch<='9')
			{
				d+=ch;
			}
			else if (!(ch>='0' && ch<='9'))
			{
				int e=Integer.parseInt(0+d);
				d1+=e;
				d="";
			}
			b++;
		}
		if (d!="")
		{
			int e=Integer.parseInt(0+d);
			d1+=e;
			d="";
		}
		System.out.println("Total ="+d1);
	}
	public static int balance(int a)
	{
		String c=s,d="";
		int b=0;
		int d1=0;
		while (b<c.length())
		{
			char ch=c.charAt(b);
			if (ch>='0' && ch<='9')
			{
				d+=ch;
			}
			else if (!(ch>='0' && ch<='9'))
			{
				int e=Integer.parseInt(0+d);
				d1+=e;
				d="";
			}
			b++;
		}
		if (d!="")
		{
			int e=Integer.parseInt(0+d);
			d1+=e;
			d="";
		}
		int bal=d1-a;
		System.out.println("Balance ="+bal);
		return bal;
	}
	public static String selecting()
	{
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		return s;
	}
	
	public static void main(String [] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Press 1:For Know About us         Press 2:For Menu    ");
		int select=scan.nextInt();
		switch (select)
		{
		case 1:
			aboutUs();
			System.out.println("Press 1:To Continue For Menu           Press 2:To Exit   ");
			int fb=scan.nextInt();
			switch (fb)
			{
			case 1:
				System.out.println("Our Menu's Are");
				menu();
				System.out.println("Your Ordering for Above Items");
				a1();
				total();
			System.out.println("Press 1: To Place Your Order      Press 2:To Exit");
			int sa=scan.nextInt();
			switch (sa)
			{
			case 1:
				System.out.println("------YOUR ORDER HAS BEEN CONFORMED------");
				total();
				System.out.println("PLEASE ENTER ADDRESS IN PINCODE");
				Scanner scan1=new Scanner(System.in);
				int add1=scan1.nextInt();
				System.out.println("PLEASE ENTER DELEVIERY BOY ADDRESS IN PINCODE");
				int dd1=scan1.nextInt();
				System.out.println("Press 1:TO PAY BALANCE NOW          Press 2:PAY ON DELEIVERY");
				int sb=scan1.nextInt();
				switch (sb)
				{
				case 1:
					System.out.println("Please Pay The Balance");
					int bt=scan.nextInt();
					balance(bt);
					if (add1==dd1)
					{
						System.out.println("YOUR ORDER IS AT YOUR DOOR STEPS");
						if (balance(bt)==0)
						{
							System.out.println("PLEASE TAKE YOUR ORDER");
						}
						else
						{
							System.out.println("PLEASE PAY THE BALANCE");
							Scanner scan2=new Scanner(System.in);
							int bt2=scan2.nextInt();
							balance(bt2);
						}
					}
					else
					{
						System.out.println("Your Order is on the way");
					}
				case 2:
					break;
				
				}
			case 2:
				break;
			}
			case 2:
				break;
			
			}
			break;
		case 2:
			System.out.println("Our Menu's Are");
			menu();
			System.out.println("Your Ordering for Above Items");
			a1();
			total();
			System.out.println("Press 1: To Place Your Order      Press 2:To Exit");
			int sa=scan.nextInt();
			switch (sa)
			{
			case 1:
				System.out.println("------YOUR ORDER HAS BEEN CONFORMED------");
				total();
				System.out.println("PLEASE ENTER ADDRESS IN PINCODE");
				Scanner scan3=new Scanner(System.in);
				int add=scan3.nextInt();
				System.out.println("PLEASE ENTER DELEVIERY BOY ADDRESS IN PINCODE");
				int dd=scan3.nextInt();
				System.out.println("Press 1:TO PAY BALANCE NOW          Press 2:PAY ON DELEIVERY");
				int sb=scan3.nextInt();
				switch (sb)
				{
				case 1:
					System.out.println("Please Pay The Balance ");
					int bt=scan.nextInt();
					balance(bt);
					if (add==dd)
					{
						System.out.println("YOUR ORDER IS AT YOUR DOOR STEPS");
						if (balance(bt)==0)
						{
							System.out.println("PLEASE TAKE YOUR ORDER");
						}
						else
						{
							System.out.println("PLEASE PAY THE BALANCE");
							Scanner scan4=new Scanner(System.in);
							int bt1=scan4.nextInt();
							balance(bt1);
						}
					}
					else
					{
						System.out.println("Your Order is on the way");
					}
				case 2:
					break;
				
				}
			case 2:
				break;
			}
		}
		
	}
}