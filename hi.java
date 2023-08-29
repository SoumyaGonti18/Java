class hi
{
	public static void main(String args[])
	{
		double total=1500;
		if(total>2000)
		{
			double discount=(10.0/100)*total;
			System.out.println(discount);
		}
		else
		{
			double tax=(5.0/100)*total;
			System.out.println(tax);
		}
	}
}