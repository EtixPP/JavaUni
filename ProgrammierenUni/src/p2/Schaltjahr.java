package p2;

import p1.EAM;

public class Schaltjahr {

	
	public static void main(String[] args)
	{
		int l_year = 0;
		
		while (l_year != 9999)
		{
			System.out.println("Geben sie ein Jahr ein!");
			l_year = EAM.rInt();
			if (l_year % 4 == 0)
			{

				if (l_year % 100 == 0)
				{
					if (l_year % 400 == 0)
						System.out.println("Es handelt sich  um ein Schaltjahr!");
					else
						System.out.println("Es handelt sich nicht um ein Schaltjahr!");
				}
				else
					System.out.println("Es handelt sich  um ein Schaltjahr!");
			}
			else
				System.out.println("Es handelt sich nicht um ein Schaltjahr!");
		}
			
		System.out.println("Das Programm wird abgebrochen!");
	}
	
}
