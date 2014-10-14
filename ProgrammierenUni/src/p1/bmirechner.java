package p1;

public class bmirechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l_gewicht;
		int l_groesse;
		// TODO Auto-generated method stub
		System.out.println("Bitte geben sie ihr Gewicht ein:");
		l_gewicht = EAM.rInt();
		System.out.println("Bitte geben sie ihre größe in cm ein:");
		l_groesse = EAM.rInt();
		l_gewicht *= 10000;
		int l_bmi = l_gewicht / (l_groesse * l_groesse);
		System.out.println(l_bmi );
		
	}

}
