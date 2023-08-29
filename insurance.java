class insurance
{
	public static void main(String args[])
	{
		int age=28;
		String health="poor";
		String gender="male",lives="village";
		double premium=0;
		double amount=20000;
		if((age>=25)  &&  (age<=35))
		{
			if(lives=="city"&& health=="excellent"&& gender=="male")
			{
				amount=amount+1000;
				premium=(amount/100.0)*2;
			}
			else if(lives=="city"&& health=="excellent"&& gender=="female")
			{
				amount=amount+2000;
				premium=(amount/100.0)*4;
			}
			else if(lives=="village"&& health=="poor"&& gender=="male")
			{
				amount=amount+3000;
				premium=(amount/100.0)*6;
			}
			else if(lives=="village"&& health=="poor"&& gender=="female")
			{
				amount=amount+4000;
				premium=(amount/100)*8;
			} 
			System.out.println(amount);
			System.out.println(premium);
		}
		else
				System.out.println("INSECURED TO GET INSURANCE POLICY");
	
	}
}





			