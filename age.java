class First
{
	public static void main(String args[])
        {
		int date=18;
		int month=9;
		int born_year=2002;
		int current_year=2023;
		int current_dob = current_year-born_year;
		int months_per_year=current_dob*12;
		int days_per_year=current_dob*365;
		int weeks=days_per_year/7;
		int hours=days_per_year*24;
		int minutes=hours*60;
		int seconds=minutes*60;
		System.out.println("CURENT AGE : " + current_dob);
		System.out.println("MONTHS :" + months_per_year);
		System.out.println("WEEKS:" + weeks);
		System.out.println("DAYS:" + days_per_year);
		System.out.println("HOURS:" + hours);
		System.out.println("MINUTES:" + minutes);
		System.out.println("SECONDS:" + seconds);


        }	
}