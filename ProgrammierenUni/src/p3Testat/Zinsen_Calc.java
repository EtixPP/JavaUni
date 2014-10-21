package p3Testat;
import p3Testat.EAM;
public class Zinsen_Calc 
{


	public static void main(String[] args) 
	{
		System.out.println("Darlehenssumme in Euro:");
		double l_loan = EAM.rDouble();
		System.out.println("Zinssatz in Protzent:");
		double l_InterestRate = EAM.rDouble();	//Zinsrate
		double l_LoanLeft = l_loan; // Lokale Variable wie viel Lohn über ist
		byte l_iterator = 1; // Iterator zum Monate zählen
		System.out.println("Monat - Restschulden - Zinsen"); 
		while(l_LoanLeft != 0) //Solange das Darlehen nicht abgezahlt ist ( da bei 12.5 immer 8 mal ginge auch iterator < 9)
		{
			//Ausgabe des Monats, des übrigen Lohns und der Zinsen die sich aus Zinsatz / 12 berechnen
			System.out.println(l_iterator +" - " + l_LoanLeft + " - " + (l_LoanLeft/100)*(l_InterestRate/12)); 
			// Neuberechnung des übrigen lohns mit einem Satz von 12.5 %																								
			l_LoanLeft = l_LoanLeft - (l_loan / 100 * 12.5);
			l_iterator++;
		}
	}

}
