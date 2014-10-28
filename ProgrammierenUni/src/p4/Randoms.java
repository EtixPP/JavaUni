package p4;

import java.util.Random;

public class Randoms {

	
	public static void main(String[] args) {
		int[] RandomSave = new int[6];
		boolean IsIn = false;
		int counter = 0;
		while(RandomSave[5] == 0)
		{
			Random ran = new Random();
			int randomnumber = ran.nextInt(49) + 1;
			for(int i = 0; i < 6 ; i++)
			{
				if(RandomSave[i] == randomnumber)
				{
					IsIn = true;
					break;
				}
					
			}
			if(!IsIn)
			{
				RandomSave[counter] = randomnumber;
				counter++;
			}
			IsIn = false;
		}
		for(int i = 0; i < 6 ; i++)
		{
			System.out.println(RandomSave[i]);
		}
	}

}
