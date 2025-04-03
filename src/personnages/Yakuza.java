package personnages;

public class Yakuza extends Humain{
	private int reputation;
	private String clan;

	public Yakuza(String nom, String boissonPreferer, int argent, String clan) {
		super(nom, boissonPreferer, argent);
		this.reputation = 0;
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public String getClan() {
		return clan;
	}

	public void setReputation(int reputation) {
		this.reputation = reputation;
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() +
				" et j'aime boire du " + getBoissonPreferer());
		parler("Mon clan est celui de " + getClan() + ".");
	}

	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		reputation++;
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		parler("J'ai piqu� les " + gain + " sous de "
				+ victime.getNom() + ", ce qui me fait "
				+ getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
}
