package casino;

import casino.Asztal;

//Prevent Jatekos initialization
abstract public class Jatekos {
	protected Asztal asztal;
	protected static int ID = 0;
	protected int azonosito;
	
	protected Jatekos()
	{
		ID++;
		azonosito = ID;
	}
	
	public void lep()
	{
		asztal.emel(2.2);
	}
	
	public void setAsztal(Asztal a)
	{
		asztal = a;
	}
	
	protected void finalize()
	{
		System.out.println("ID: " + azonosito + ", " + toString());
	}
}
