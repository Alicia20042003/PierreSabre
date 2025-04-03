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
		perdreArgent(sommeDix);
		beneficiaire.recevoir(sommeDix);
	}
	
	public void provoquer(Yakuza adversaire) {
		int force = this.honneur * 2;
		int argentVol = 0;
		int adversRep = adversaire.getReputation();
		parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait � ce pauvre marchand !");		
		
		if(force >= adversRep) {
			argentVol = adversaire.getArgent();
			adversaire.perdreArgent(argentVol);
			adversaire.setReputation(adversRep - 1);
			gagnerArgent(argentVol);
			parler("Je t'ai eu petit yakuza !");
			this.honneur ++;
			adversaire.parler("J'ai perdu mon duel et mes " + argentVol + " sous, snif... J'ai déshonoré le clan de "+ adversaire.getClan() + ".");
		}
		else {
			this.honneur --;
			parler("J'ai perdu contre ce yakuza, mon honneur "
					+ "et ma bourse en ont pris un coup.");
			adversaire.setReputation(adversRep + 1);
			adversaire.parler("Ce ronin pensait vraiment battre " 
					+ adversaire.getNom()
					+ " du clan de " + adversaire.getClan() +" ? Je l'ai depouille de ses "
					+ getArgent() + " sous.");
			adversaire.gagnerArgent(getArgent());
			perdreArgent(getArgent());
		}		
	}
}
