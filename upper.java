class upper
{
	public static void main(String args[])
	{
		char a='b';
		int x=(int)(a);
		int z=0;
		if(x>=65)
		{
			if(x<=90)
			{
				z=x+32;
			}
		
		else if(x>=97)
		{
				if(x<=122)
				{
					z=x-32;
				}
		}
		}
		
		char t=(char)z;
		System.out.println(t);
	}
}		