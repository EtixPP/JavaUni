package p2;

import p1.EAM;
@SuppressWarnings("unused")
public class Perfect_Number 
{

	public static void main(String[] args)
	{
		for ( int i = 0; i < 100000; i++)
			if(IsPerfect(i))
				System.out.println(i);
	}
	public static boolean IsPerfect(int p_Num)
	{
		int l_sum = 0;
		int l_counter = p_Num/2;
		while(l_counter > 0)
		{			
			if(p_Num % l_counter == 0)
				l_sum += l_counter;
			l_counter--;

		}
		if(l_sum == p_Num && l_sum != 0)
			return true;
		else 
			return false;
	}

	
}