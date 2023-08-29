class First
{
	public static void main(String args[])
	{
		String name="APPLE iPhone 14(Blue,128 GB)";
		double cost=79900;
		double off_14=(14.0/100)*cost;
		off_14=(int)(off_14);
		double after_discount=cost-off_14;
		after_discount=(int)(after_discount);
		double packing_fee=99;
		double after_packing=after_discount+packing_fee;
		double extra_5=(5.0/100)*after_packing;
		double after_extra5=after_packing-extra_5;
                double last=after_extra5-7000;
		System.out.println(name);
		System.out.println("Rs. " +  cost);
		System.out.println("14%  : " + off_14);
		System.out.println("AFTER DISCOUNT: " +           after_discount);
		System.out.println("PACKING FEE : " +  after_packing);
		System.out.println("AFTER EXTRA 5% : " + after_extra5);
		System.out.println("FINAL Rs." + last);
		
		
	}
	
}
		