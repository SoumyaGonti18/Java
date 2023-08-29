class week
{
	public static void main(String args[])
	{
		String activity="";
		String day="friay";
		if(day=="sunday")
		{
			activity="movies";
		}
		else if(day=="monday")
		{
			activity="cricket";
		}
		else if(day=="tuesday")
		{
			activity="outing";
		}
		else if(day=="wednesday")
		{
			activity="outing";
		}
		else if(day=="thursday")
		{
			activity="playing";
		}
		else if(day=="friday")
		{
			activity="gardening";
		}
		else if(day=="saturday")
		{
			activity="cleaning";
		}
		else
		{
		System.out.println("TRY AGAIN");
		}
		System.out.println(activity);
	}
}
