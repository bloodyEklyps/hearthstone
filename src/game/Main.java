package game;

import heros.*;

public class Main {

	public static void main(String[] args){
		System.out.println("Joueur 1 quelle est votre nom?");
		String p1name=getPlayerName();
		System.out.println("Quel sera votre hero?");
		System.out.println("1-Mage   2-Paladin   3-Warrior");
		Hero p1Hero=getHero();
		Player p1=new Player(p1name, p1Hero);
		
		System.out.println("Joueur 2 quelle est votre nom?");
		String p2name=getPlayerName();
		System.out.println("Quel sera votre hero?");
		System.out.println("1-Mage   2-Paladin   3-Warrior");
		Hero p2Hero=getHero();
		Player p2=new Player(p2name, p2Hero);
		
		Game game=new Game(p1,p2);
		game.play();
		System.out.println("Partie finie");
	}

	public static String getPlayerName() {
		return Utils.getInputString();
	}

	public static Hero getHero() {
		int number=Utils.getInputInt();
		Hero hero = null;
		switch (number) {
		case 1:
			hero=new Mage();
			break;
		case 2:
			hero=new Paladin();
			break;
		case 3:
			hero=new Warrior();
			break;
		default:
			break;
		}
		// once finished
		return hero;
	}
}
