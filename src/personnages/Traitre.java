package personnages;

public class Traitre extends Samourai {

	private int niveauTraitrise;
	
	public Traitre(String nom, String boissonPreferer, int argent, String seigneur) {
		super(nom, boissonPreferer, argent, seigneur);
		this.niveauTraitrise = 0;
	}
	
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() +
				" et j'aime boire du " + getBoissonPreferer() + ".");
		parler("Je suis fier de servir le seigneur " + getSeigneur() + ".");
	}

}
