class SmartWatch 
{
	String brand;
	String model;
	String color;
	int price;
	String screenType;
	SmartWatch(String brand,String model,String color,int price,String screenType)
	{
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.price=price;
		this.screenType=screenType;
	}
	public void display()
	{
		System.out.println("The Brand is: "+this.brand);
		System.out.println("The Model is: "+this.model);
		System.out.println("The Color is: "+this.color);
		System.out.println("The Price is: "+this.price);
		System.out.println("The ScreenType is: "+this.screenType);
		System.out.println("(*.*)(*.*)(*.*)(*.*)(*-*)(^_^)(^_^)(*-*)(*.*)(*.*)(*.*)(*.*)");
	}
	public static void main(String[] args) 
	{
		SmartWatch s1=new SmartWatch("NOISE","i2","silver",1900,"AMO-LED");
		s1.display();
		SmartWatch s2=new SmartWatch("Fire-Bolt","i5","Black",2900,"AMO-LED");
		s1.display();
	}
}
