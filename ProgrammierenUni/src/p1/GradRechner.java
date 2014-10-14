package p1;

public class GradRechner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l_fahrenheit;
		int l_celsius;
		System.out.println("Bitte geben sie die Grad Fahrenheit ein:");
		l_fahrenheit = EAM.rInt();
		l_celsius =  (  ( l_fahrenheit *5) - (32*5)) / 9;
		int l_nachkomma = (  ( l_fahrenheit *5) - (32*5)) % 9;
		System.out.println("Der eingegebene Wert entspricht: "+l_celsius+"."+l_nachkomma+" Grad");


	}

}
