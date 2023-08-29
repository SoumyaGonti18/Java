class main
{
	public static void main(String args[])
	{
		int n=7;
		if(n%2==0)
		{
			n=n/2;
			System.out.println(n);
		}
		else
		{
			n=(3*n+1)/2;
			System.out.println(n);
		}
	}
}