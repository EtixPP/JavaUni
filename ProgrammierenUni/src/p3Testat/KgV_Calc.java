package p3Testat;
import p3Testat.EAM;
public class KgV_Calc 
{
	
	/* Eher unsch�ne L�sung.
	public static void main(String[] args) 
	{
		System.out.println("Geben sie x ein:");
		long l_xInput = EAM.rLong();
		System.out.println("Geben sie y ein:");
		long l_yInput = EAM.rLong();
		byte l_iteratorX = 2;
		byte l_iteratorY = 2;
		long l_x = l_xInput;
		long l_y = l_yInput;
		
		while ( l_x != l_y )
		{
			if ( (l_xInput * l_iteratorX) > (l_yInput * l_iteratorY))
			{
				l_iteratorY++;
				l_y = l_yInput * l_iteratorY;
			}
			if ( (l_xInput * l_iteratorX) < (l_yInput * l_iteratorY))
			{
				l_iteratorX++;
				l_x = l_xInput * l_iteratorX;				
			}				
		}
		System.out.println("Das kleinste gemeinsame Vielfache ist: "+l_x);
		
	}
	*/
	//Sch�nere L�sung (naja Ansichtssache :) )
	
	
	
	public static void main(String[] args) 
	{
		System.out.println("Geben sie x ein:");
		long l_xInput = EAM.rLong();
		System.out.println("Geben sie y ein:");
		long l_yInput = EAM.rLong();
		byte l_counter ; //Counter variable, sollte als Byte ausreichen
		long l_result = l_yInput; //Falls beide if�s nicht zutreffen sind die Zahlen gleich und das
	     // kleinste gemeinsame Vielfache ist die Zahl selber. Result local �ber den Verzweigungen erstellt
		// da sie sonst zerst�rt wird wenn sie den Scope verl�sst.
		if ( l_xInput > l_yInput) // Der x Input ist die gr��ere Zahl
		{
			//For Schleife die herrausfindet wann der gr��ere * iterator durch die kleinere eine
			//ganze Zahl ergibt -> das ist dann auch das kgV
			for (l_counter = 1;( (l_counter*l_xInput) % l_yInput) != 0; l_counter++); 
			l_result = l_counter * l_xInput;
		}
		if ( l_xInput < l_yInput) // Der y Input ist die gr��ere Zahl
		{
			//For Schleife die herrausfindet wann der gr��ere * iterator durch die kleinere eine
			//ganze Zahl ergibt -> das ist dann auch das kgV
			for (l_counter = 1;( (l_counter*l_yInput) % l_xInput) != 0; l_counter++);	
			l_result = l_counter * l_yInput;
		}
		System.out.println("Das kleinste gemeinsame Vielfache ist: "+l_result);
		
	}
}
