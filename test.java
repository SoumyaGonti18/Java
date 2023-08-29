class Test 
{
	public static void main(String args[])
	{
	String name="MONEY HEIST";
	double ratings=4.5;
	String description="A Professor make a group of people to robbery a bank.He guides the people in the group from outside.The process of entering into the bank and leaving the bank is this series.";
	String platform ="Disney+ Hotstar";
	double sub_1yr=149 ;
	double sub_per_2yr=sub_1yr*2;
	double discount = (2.0/100)*sub_1yr;
	double payment=sub_1yr-discount;
	int payment2=(int)(payment);
	System.out.println(name);
	System.out.println("Ratings:" + ratings);
	System.out.println("Description:"+description);
	System.out.println("Available on :"+platform);
	System.out.println("Subscribe with : " + payment);
	System.out.println("Payment: "+ payment2);
 
	}
}