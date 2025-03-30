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
		int force = honneur * 2;
		int argentVolé = 0;
		int adversRep = adversaire.getReputation();
		
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que "
				+ "tu as fait à ce pauvre marchand !");		
		
		if(force >= adversRep) {
			argentVolé = adversaire.getArgent();
			adversaire.perdreArgent(argentVolé);
			adversaire.setReputation(adversRep - 1);
			gagnerArgent(argentVolé);
			parler("Je t'ai eu petit yakuza !");
			this.honneur ++;
			adversaire.parler("J'ai perdu mon duel et mes " + argentVolé
					+ " sous, snif... J'ai déshonoré le clan de Warsong.");
		}
		else {
			this.honneur --;
			parler("J'ai perdu contre ce yakuza, mon honneur "
					+ "et ma bourse en ont pris un coup.");
			adversaire.setReputation(adversRep + 1);
			adversaire.parler("Ce ronin pensait vraiment battre " 
					+ adversaire.getNom()
					+ " du clan de Watsong ? Je l'ai dépouillé de ses "
					+ getArgent() + " sous.");
			adversaire.gagnerArgent(getArgent());
			perdreArgent(getArgent());
		}		
	}
}
