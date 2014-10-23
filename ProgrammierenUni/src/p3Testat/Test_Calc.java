package p3Testat;
import p3Testat.EAM;



public class Test_Calc 
{
	public static void main(String[] args) 
	{
		boolean stop = false;
		while(!stop)
		{
			System.out.println("Geben sie die erreichten Punkte ein:");
			double l_AchievedPoints = EAM.rDouble();
			if( l_AchievedPoints >= 0 && l_AchievedPoints <= 120)
			{
				if(l_AchievedPoints < 60) 
				{
					System.out.println("Die erreichte Note ist: 5.0"); 
					break;
				}
				double l_result = 3* (120-l_AchievedPoints)/(120-60) +1;
				System.out.println("Die erreichte Note ist: " + PicResult(l_result));
				stop = true;
			}
		}


		

	}
	// ist doch nicht nötig
	public static Double round(double p_Num) 
	{
		double l_result = p_Num * 10 + 0.5;
		long l_shorten = (long)l_result;
		l_result = (double)l_shorten/10;
		return l_result;
	}
	// Sehr unschön gelöst, aber die Formel scheint mir sehr suspekt, hab da noch etwas nach gegoogelt 
	// und es nach dem System gemacht, da ich keine Ahnung hatte warum zwischendurch ein 0.4 er Schritt drin war
	// http://www.uni-saarland.de/fak8/infos-chemie/reformstudium/Notenberechnung.pdf
	// 4 - (0.005 * (erreichter Punkte - 60)) Hab ich vorher benutzt aber da passt der 0,4er Schritt ja nicht rein und die große Rundung ( von etwas was sich um 0,2 verschiebt)
	// könnte man dann immer noch nicht viel schöner lösen.
	public static Double PicResult(double p_Num)
	{
		if( p_Num <= 1.1) return 1.0;
		if( p_Num <= 1.5) return 1.3;
		if( p_Num <= 1.8) return 1.7;
		if( p_Num <= 2.1) return 2.0;
		if( p_Num <= 2.5) return 2.3;
		if( p_Num <= 2.8) return 2.7;
		if( p_Num <= 3.1) return 3.0;
		if( p_Num <= 3.5) return 3.3;
		if( p_Num <= 3.8) return 3.7;
		if( p_Num <= 4.0) return 4.0;
			
		return 0.0;
	}
}
