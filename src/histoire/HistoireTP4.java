package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		Commercant marchand = new Commercant("Marco", "thé", 20);
		Yakuza yaku = new Yakuza("Yaku", "biere", 30);
		
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		
		System.out.println();
		marchand.direBonjour();
		marchand.seFaireExtorquer();
		marchand.recevoir(15);
		marchand.boire();
		
		System.out.println();
		yaku.direBonjour();
		yaku.extorquer(marchand);
				
		
	}
}
