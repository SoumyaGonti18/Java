class student
{
	public static void main(String args[])
	{
		String name="skr",grade;
		char section;
		int s1=98,s2=90,s3=98,s4=99,s5=99,s6=98;
		int total=s1+s2+s3+s4+s5+s6;
		int fee=60000,scholarship,donation;
		double percentage=(total/600.0)*100;
		if(percentage>80)
		{
			section='A';
			scholarship=2000;
			donation=0;
			grade="FIRST CLASS";
		}
		else
		{
			section='B';
			scholarship=0;
			donation=3000;
			grade="FAIL";
		}
		fee=fee-scholarship+donation;
		System.out.println(percentage);
		System.out.println(fee);
		System.out.println(grade);
	}
}
		

		