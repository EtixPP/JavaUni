package p2;

import p1.EAM;

@SuppressWarnings("unused")
public class Fak_Rechner
{

	public static void main(String[] args)
	{
		System.out.println("Geben sie die Zahl ein deren Fakult�t berechnet werden soll:");
		int l_FakNum = EAM.rInt();
		if(l_FakNum != 0)
			System.out.println( Fak_Rechner.CalcFak(l_FakNum));
		else
			System.out.println("Das Programm wird abgebrochen!");
	}
	
	public static int CalcFak (int p_number)
	{
		int l_storage = p_number;
		for(int i = p_number-1; i > 1; i--)
		{
			l_storage *= i;
		}
		return l_storage;	
	}	
	
	 public static long CalcFakRec(long n)
	{
	   if (n>1)
		   return(n*CalcFakRec(n-1)); 
	   else
		   return(1);
	}
}