class voco
{
	public static void main(String args[])
	{
		char x='O';
		if(x>=65&&x<=90)
		{
			if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U')
				System.out.println("It is UpperCase Vowel");
			else
				System.out.println("It is UpperCase Consonant");
		}
		else if(x>=97&&x<=122)
		{
			if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
				System.out.println("It is LowerCase Vowel");
			else
				System.out.println("It is LowerCase Consonant");
		}
		else if(x>='0' && x<='9')
				System.out.println("It is Numeric");
		else
				System.out.println("Any Special Character");
	}
}
	