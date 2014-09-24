package casino;

import casino.Asztal;
import casino.Jatekos;

public class Main {
	public static void main(String[] args)
	{
		Asztal a = new Asztal();
		Jatekos first = new Jatekos();
		a.addJatekos(first);
		
		Jatekos second = new Jatekos();
		a.addJatekos(second);
		
		Jatekos third = new Jatekos();
		a.addJatekos(third);
		
		for (int i=0; i<3; i++)
		{
			a.kor();
		}
	}
}
