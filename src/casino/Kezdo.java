package casino;

public class Kezdo extends Jatekos {
	public void lep()
	{
		System.out.print(toString() + " jatekos a(z) " + asztal.getKor() + ". kornel tart.");
		if(asztal.getKor()%2 == 0)
		{
			asztal.emel(5.4);
			System.out.println(" Emelt.");
		}
		else
		{
			System.out.println(" Passzolt.");
		}
	}
	
	public String toString()
	{
		return new String("Kezdo");
	}
}
