class First
{
	public static void main(String args[])
	{
		String name="SPORTY ANALOG WATCH";
		String color="BLACK";
		int pid=234567;
		double price=625;
		double quantity=2;
		double actual_price=quantity*price;
		double discount_7=(7.0/100)*actual_price;
		double cost=actual_price-discount_7;
		System.out.println("PRODUCT NAME:" + name);
		System.out.println("COLOR:" + color);
		System.out.println("PID:  "  +  pid);
		System.out.println("ACTUAL PRICE:  " + actual_price);
		System.out.println("WITH DISCOUNT OF 7 % :  " +  discount_7);
		System.out.println("PAYEMNT:   "  +cost);
	}
}
		