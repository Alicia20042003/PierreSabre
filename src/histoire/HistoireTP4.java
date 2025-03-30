package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		Commercant marchand = new Commercant("Marco", "th�", 20);
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "biere", 30);
		Ronin roro = new Ronin("Roro","shochu",60);
		
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
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marchand);
		
		System.out.println();
		roro.direBonjour();
		roro.donner(marchand);
		
		System.out.println();
		roro.provoquer(yakuLeNoir);
		
	}
}
