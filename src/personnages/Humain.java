package personnages;

public class Humain {
	private String nom;
	private String boissonPreferer;
	private int argent;
	
	
	
	public Humain(String nom, String boissonPreferer, int argent) {
		this.nom = nom;
		this.boissonPreferer = boissonPreferer;
		this.argent = argent;
	}

	//Les accesseurs en lecture
	public String getNom() {
		return nom;
	}
	
	public String getBoissonPreferer() {
		return boissonPreferer;
	}
	
	public int getArgent() {
		return argent;
	}
	
	private void parler(String texte){
		System.out.println(texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() +
				" et j'aime boire du " + getBoissonPreferer());
		//String.format("Je m'appelle %s, j'ai %d ans", nom, age);
	}
	
	public void boire() {
		parler( "Mmmm, un bon verre de " + getBoissonPreferer() + 
				" ! GLOUPS !");
	}
	
	private int gagnerArgent(int gain) {
		this.argent += gain;
		
		return this.argent;
	}
	
	private int perdreArgent(int perte) {
		this.argent -= perte;
		
		return this.argent;
	}
	
	public void acheter(String bien, int prix) {
		if(prix > getArgent()) {
			parler("Je n'ai plus que " + getArgent() + 
					" sous en poche. Je ne peux même pas m'offrir un " + bien +
					" à " + prix + " sous.");
		}
		else {
			parler("J'ai " + getArgent() + 
					" sous en poche. Je vais pouvoir m'offrir un " + bien +
					" à " + prix + " sous.");
			perdreArgent(prix);
		}
		
	}
	
}
