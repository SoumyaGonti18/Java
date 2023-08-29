class range
{
	public static void main(String args[])
	{
		int num=1107875;
		if(num>=0 && num<=9)
		{
			System.out.println(num + "   is SINGLE DIGIT NUMBER");
		}
		else if(num>=10 && num<=99)
		{
			System.out.println(num + "  is TWO DIGIT NUMBER");
		}
		else if(num>=100 && num<=999)
		{
			System.out.println(num + " is THREE DIGIT NUMBER");
		}
		
	else
	{
	 	System.out.println("REQUIRED PROPER INPUT FROM USER");
	}
	}
}