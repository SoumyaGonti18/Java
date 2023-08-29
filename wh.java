class wh
{
	public static void main(String args[])
	{
			int x=0,sum=0,mul=1;
			while(x<=10)
			{
				if(x%2==0)
				{
					sum=sum+x;
					System.out.println(sum);
					
				}
				else
				{
					mul=mul*x;
					System.out.println(mul);
					
				}
				++x;
			}
					
	}
}
