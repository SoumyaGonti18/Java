
class cs
{
	public static void main(String args[])
	{
		int a=100,b=50,c=59;
		if(a>b)
		{
			a=a+b;
			b=a-b;
			a=a-b;
		}
		if(a>c)
		{
			a=a+c;
			c=a-c;
			a=a-c;
		}
		if(b>c)
		{
			b=b+c;
			c=b-c;
			b=b-c;
		}
		System.out.println("a: " +a);
		System.out.println("b: " +b);
		System.out.println("c: " +c);
	}
}
