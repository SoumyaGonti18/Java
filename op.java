class op
{
	public static void main(String args[])
	{
		int n1=40;
		int n2=50;
		System.out.println("Before Swapping");
		System.out.println(n1+ " " +n2);
		int n3;
		n3=n1;
		n1=n2;
		n2=n3;
		System.out.println("After Swapping");
		System.out.println(n1+ " " +n2);
		System.out.println("_______________________________________________________________________________________________________");


		int a1=15;
		int a2=43;
		System.out.println("Before Swapping");
		System.out.println(a1+ " " +a2);
		a1=a1*a2;
		a2=a1/a2;
		a1=a1/a2;
		System.out.println("After Swapping");
		System.out.println(a1+ " " +a2);
		System.out.println("_______________________________________________________________________________________________________");




		int x=10;
		int y=2;
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(y/x);
		System.out.println(y%x);
	}
}