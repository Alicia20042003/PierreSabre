package personnages;

public class Yakuza extends Humain{
	private int reputation;

	public Yakuza(String nom, String boissonPreferer, int argent) {
		super(nom, boissonPreferer, argent);
		this.reputation = 0;
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
