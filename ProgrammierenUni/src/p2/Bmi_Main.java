package p2;

import p1.EAM;
@SuppressWarnings("unused")
public class Bmi_Main 
{

	public static void main(String[] args)
	{
		Bmi_Main.BerechnePersonen(3);
	}
	public static void BerechnePersonen(int p_PersonAmount)
	{
		double l_average = 0;
		for(int i = 0; i < p_PersonAmount; i++)
		{
			double l_gewicht;
			double l_groesse;
			System.out.println("\nBearbeite Person:"+(i+1));
			System.out.println("Bitte geben sie ihr Gewicht ein:");
			l_gewicht = EAM.rDouble();
			System.out.println("Bitte geben sie ihre gr��e in Metern ein:");
			l_groesse = EAM.rDouble();
			double l_bmi = l_gewicht / (l_groesse * l_groesse);
			l_average += l_bmi;
			System.out.println("Person "+(i+1)+" hat einen Bmi von "+l_bmi );
		}
		System.out.println("Der Durchschnitt ist  "+l_average );
	}
	
	
	
}
