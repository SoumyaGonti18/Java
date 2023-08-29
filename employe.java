class employe
{
	public static void main(String args[])
	{
		String name="SAI KESHAVA REDDY";
		String company="Wipro";
		int salary=25000,age=22;
		char gender='M';
		int ha=2000,ta=2000,hra=1000;
		double gross_salary;
		double pf;
		double total_salary=salary+ha+ta+hra;
		if(total_salary>15000)
		{
			pf=(10/100.0)*total_salary;
			
		}
		else
		{
			pf=(50/100.0)*total_salary;

		}
		total_salary=total_salary-pf;
		gross_salary=total_salary*12;
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(company);
		System.out.println("ONE MONTH SALARY : " + total_salary);
		System.out.println("ONE YEAR SALARY : " + gross_salary);
	}
}