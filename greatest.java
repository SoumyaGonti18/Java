class greatest
{
	public static void main(String args[])
	{
		int n1=109,n2=67,n3=2562;
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println(n1 + " is largest");
			}
			else
			{
				System.out.println(n3 + " is largest");
			}
		}
		else
		{
			if(n2>n3)
			{
				System.out.println(n2 + " is largest");
			}
			else
			{
				System.out.println(n3 + " is largest");
			}
		}
	}
}