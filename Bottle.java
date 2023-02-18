class Bottle 
{
	String brand;
	String capacity;
	String color;
	int price;
	String metalType;
	Bottle(String brand,String capacity,String color,int price,String metalType)
	{
		this.brand=brand;
		this.capacity=capacity;
		this.color=color;
		this.price=price;
		this.metalType=metalType;
	}
	public void display()
	{
		System.out.println("The Brand is: "+this.brand);
		System.out.println("It's Capacity is: "+this.capacity);
		System.out.println("The Color is: "+this.color);
		System.out.println("The Price is: "+this.price);
		System.out.println("The metalType is: "+this.metalType);
		System.out.println("!@#$%^&*())(*&^%$#@!");
	}
	public static void main(String[] args) 
	{
		Bottle b1=new Bottle("TupperWare","2liters","red",120,"Plastic");
		b1.display();
		Bottle b2=new Bottle("MILTON","1.5liters","silver",200,"Steel");
		b2.display();
	}
}
