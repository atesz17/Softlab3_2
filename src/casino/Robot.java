package casino;

import casino.Jatekos;

public class Robot extends Jatekos {
	
	public Robot()
	{
		azonosito = ID;
	}
	
	public void lep()
	{
		System.out.println(toString() + " jatekos a(z) " + asztal.getKor() + ". kornel tart. Passzolt.");
	}
	
	public String toString()
	{
		return new String("Robot " + azonosito);
	}
}
