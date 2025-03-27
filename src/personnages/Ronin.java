package personnages;


public class Ronin extends Humain{
	private int honneur;

	public Ronin(String nom, String boissonPreferer, int argent) {
		super(nom, boissonPreferer, argent);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		int sommeDix = Math.round((getArgent())/10);
		
		beneficiaire.gagnerArgent(sommeDix);
	}
}
