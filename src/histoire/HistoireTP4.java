package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		Commercant marco = new Commercant("Marco", "The", 20);
		Commercant chonin = new Commercant("Chonin", "The", 40);
		Commercant kumi = new Commercant("Kumi", "The", 10);
		Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "Whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro","shochu",60);
		
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		
		System.out.println();
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		System.out.println();
		yakuLeNoir.direBonjour();
		yakuLeNoir.extorquer(marco);
		
		System.out.println();
		roro.direBonjour();
		roro.donner(marco);
		
		System.out.println();
		roro.provoquer(yakuLeNoir);
		
		System.out.println();
		marco.faireConnaissanceAvec(roro);
		
		System.out.println();
		marco.faireConnaissanceAvec(yakuLeNoir);
		
		System.out.println();
		marco.faireConnaissanceAvec(chonin);
		
		System.out.println();
		marco.faireConnaissanceAvec(kumi);
		
		System.out.println();
		marco.listerConnaissance();
		roro.listerConnaissance();
		yakuLeNoir.listerConnaissance();
	}
}
