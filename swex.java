class swex
{
	public static void main(String [] args)
	{
		
		switch('a')
		{
			case 'a': 				
			case 'e': 					
			case 'i': 				
			case 'o': 			
			case 'u': 
						System.out.println("Vowel");
									break;
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
						System.out.println("Numeric Character");
										break;
			default: 
						System.out.println("Consonant");
		}
	}
}