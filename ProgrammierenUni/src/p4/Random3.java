package p4;

import java.util.Random;

public class Random3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] RandomSave = new int[6];
		for(int i = 0; i < 6 ; i++)
		{
			int randomnumber = (int)(Math.random()*49+1);
			if(!IsIn(RandomSave, randomnumber))
			{
				RandomSave[i] = randomnumber;
			}
			else
			{
				i--;
			}		
		}
		for(int i = 0; i < 6 ; i++)
		{
			System.out.println(	RandomSave[i]);
				
		}
	}
	
	
	
	public static boolean IsIn(int[] array, int pVal)
	{
		for(int i = 0; i < 6; i++)
		{
			if(array[i] == pVal) 
				return true;
		}
		return false;
		
	}
}
