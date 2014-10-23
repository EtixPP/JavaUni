package p3Testat;
import p3Testat.EAM;
public class Wallis_Product {


	public static void main(String[] args) 
	{
		System.out.println("Geben sie ein n ein:");
		long l_n = EAM.rLong();
		double l_result = 2;
		double l_top = 2;
		double l_bottom = 3;
		for ( long i = 0; i < l_n-1; i++)
		{
			l_result = l_result * (l_top / l_bottom);
			if(l_bottom > l_top) l_top+=2;
			else if(l_bottom < l_top) l_bottom+=2;
		}
		System.out.println("N�herungswert f�r Pi (iterativ berechnet) ist: "+ 2* l_result);
		try
		{
			System.out.println("N�herungswert f�r Pi (rekursiv berechnet) ist: "+ 2* ValRec(l_n,false,2.0,1.0));
		}
		catch(StackOverflowError e)
		{
			System.out.println("Zu auslastend f�r die rekursive Variante :( (so bis 3000 +- 1000 gehts, zmd. auf meinem Rechner)");
		}

		

	}
	public static Double ValRec(double p_Num, boolean p_switch, double p_top, double p_bot) // Nur ein bisschen rumgespielt, h�chstwahrscheinlich eher m��ig effektiv implementiert.
	{
		if(p_Num > 0)
		{
			boolean l_switch = p_switch;
			double l_result = p_top/p_bot;
			if(l_switch) p_top += 2; 
			else p_bot +=2;
			return l_result * ValRec (p_Num-1,!l_switch,p_top,p_bot);	
			/*
			 * 
			 * 	Alte Variante, oben so weit optimiert, dass er deutlich h�here Zahlen handlen kann.	(bis zu 6000 anstatt 3000!!! Hab noch �berlegt mit float anstatt double
			 * zu arbeiten da es nur 4 bytes zieht, aber das w�rde dann zu sehr auf die Genauigkeit gehen.
			boolean l_switch = p_switch;
			double l_top = p_top;
			double l_bot = p_bot;
			double l_result = l_top/l_bot;
			if(l_switch) l_top += 2; 
			else l_bot +=2;
			return l_result * ValRec (p_Num-1,!l_switch,l_top,l_bot);	
			 * 
			 */
		}
		else
			return 1.0;
	}
}
