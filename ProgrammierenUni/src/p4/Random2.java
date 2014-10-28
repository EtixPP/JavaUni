package p4;

import java.util.Random;

public class Random2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] randomsave = new int[100];
		int[] counter = new int[6];
		for(int i= 0; i<100;i++)
		{
			Random ran = new Random();
			int randomnumber = ran.nextInt(6) + 1;	
			randomsave[i] = randomnumber;
			counter[randomnumber-1] += 1;
		}
		int HighestNumber = 0;
		int HighestThrowNumber = 0;
		for(int i= 0; i<6;i++)
		{
			if (HighestThrowNumber < counter[i])
			{
				HighestThrowNumber = counter[i];
				HighestNumber = i;
			}
			System.out.println("Die "+(i +1)+" wurde "+counter[i]+" mal geworfen!");
		}		
		System.out.println("Die am Häufigsten geworfene Augenzahl ist "+(HighestNumber+1)+ " und wurde bei folgenden Würfen geworfen:");
		for(int i= 0; i<100;i++)
		{	
			if(randomsave[i] == (HighestNumber+1))
				System.out.println(i);
		}

	}

}
