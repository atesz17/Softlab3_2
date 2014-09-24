package casino;

import casino.Asztal;

public class Main {
	public static void main(String[] args)
	{
		try
		{
			Asztal a = new Asztal();
			//a.kor();
			
			Robot first = new Robot();
			a.addJatekos(first);
			
			Kezdo second = new Kezdo();
			a.addJatekos(second);
			
			Kezdo third = new Kezdo();
			a.addJatekos(third);
			
			
			// Hibat jelezne a compiler
			// Jatekos fourth = new Jatekos();
			
			for (int i=0; i<3; i++)
			{
				a.kor();
			}
		}
		catch(NincsJatekos e)
		{
			System.out.println(e.getMessage());
		}
	}
}
