package p3Testat;
import p3Testat.EAM;
public class Wallis_Product {


	public static void main(String[] args) {
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
		System.out.println("Näherungswert für Pi ist: "+ 2* l_result);

		

	}

}
