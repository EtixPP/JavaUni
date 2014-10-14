package p1;

public class feier 
{


	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int l_guests;
		int l_PiePieces;
		// TODO Auto-generated method stub
		System.out.println("Bitte geben sie die Anzahl der Gäste ein:");
		l_guests = EAM.rInt();
		System.out.println("Geben sie nun die Anzahl der eingekauften Tortenstücke ein:");
		l_PiePieces = EAM.rInt();
		int l_PiePiecesOver = l_PiePieces % l_guests;
		int l_result = (l_PiePieces - l_PiePiecesOver) / l_guests;
		
		/*
		 * Alternative:
		 * int l_PiePiecesOver = 0;
		while ((l_PiePieces % l_guests) != 0)
		{
			l_PiePieces--;
			l_PiePiecesOver++;
		}
		int l_result = l_PiePieces / l_guests; */
		System.out.println("Jeder Gast bekommt: "+ l_result +" Tortenstücke und " + l_PiePiecesOver + " sind über");
	}

}
