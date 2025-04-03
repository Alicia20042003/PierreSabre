package personnages;

public class Humain {
	private String nom;
	private String boissonPreferer;
	private int argent;
	protected int nbConnaissance;
	private int nbMaxConnaissance = 30;
	protected Humain memoire[] = new Humain[nbMaxConnaissance];
	
	
	public Humain(String nom, String boissonPreferer, int argent) {
		this.nom = nom;
		this.boissonPreferer = boissonPreferer;
		this.argent = argent;
		this.nbConnaissance = 0;
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
	
	protected void parler(String texte){
		System.out.println(texte);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() +
				" et j'aime boire du " + getBoissonPreferer() + ".");
		//String.format("Je m'appelle %s, j'ai %d ans", nom, age);
	}
	
	public void boire() {
		parler( "Mmmm, un bon verre de " + getBoissonPreferer() + 
				" ! GLOUPS !");
	}
	
	protected int gagnerArgent(int gain) {
		this.argent += gain;
		
		return this.argent;
	}
	
	protected int perdreArgent(int perte) {
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
	
	private void memoriser(Humain humain) {
		if(nbConnaissance != nbMaxConnaissance) {
			memoire[nbConnaissance] = humain;
			nbConnaissance++;
		}
	}
	
	private void repondre(Humain humain){
		direBonjour();
		memoriser(humain);
	}
			
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);		
	}
	
	public void listerConnaissance() {
		String connaissance = "";
		if(nbConnaissance == 0) {
			parler("Je ne connais personne...");
		}
		else {
			for (int i = 0; i < nbConnaissance; i++) {
				if(connaissance.equals("")) {
					connaissance = memoire[i].getNom();
				}
				else {
					connaissance += ", " + memoire[i].getNom();
				}
			}
			
			parler("Je connais beaucoup de monde dont : "
					+ connaissance);
		}
		
	}
	
}
