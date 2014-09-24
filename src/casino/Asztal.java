package casino;

import casino.Jatekos;

public class Asztal {
	private Jatekos[] jatekosok;
	private double tet;
	private int korok;
	
	
	// Lehet irni konstruktort?
	public Asztal()
	{
		jatekosok = new Jatekos[0];
		tet = 0;
		korok = 0;
	}
	
	public void ujJatek()
	{
		tet = 0;
		korok = 0;
	}
	
	public void addJatekos(Jatekos jatekos)
	{
		/*
		int prevSize = jatekosok.length;
		Jatekos[] newArray = new Jatekos[prevSize + 1];
		for (int i=0; i<prevSize; i++)
		{
			newArray[i] = jatekosok[i];
		}
		newArray[prevSize] = jatekos;
		*/
		int prevSize = jatekosok.length;
		Jatekos[] newArray = new Jatekos[prevSize + 1];
		System.arraycopy(jatekosok, 0, newArray, 0, prevSize);
		newArray[prevSize] = jatekos;
		jatekosok = newArray;
		jatekos.setAsztal(this);
	}
	
	public int getKor()
	{
		return korok + 1;
	}
	
	public void emel(double d)
	{
		tet += d;
	}
	
	public void kor()
	{
		for (Jatekos j : jatekosok)
		{
			j.lep();
		}
		System.out.println("Current poll: " + tet);
		korok++;
	}
}
