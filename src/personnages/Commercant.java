package personnages;


public class Commercant extends Humain{
	
	public Commercant(String nom, String boissonPref, int argent)  {
		super(nom, boissonPref, argent);
	}

	public int seFaireExtorquer() {
		int somme = getArgent();
		perdreArgent(somme);
		
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return somme;
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		
		parler(argent +" sous ! Je te remercie généreux donateur !");
	}
	
}
