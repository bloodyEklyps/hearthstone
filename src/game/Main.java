package game;

import java.util.Scanner;

import heros.Hero;
import heros.Mage;
import heros.Paladin;
import heros.Warrior;

public class Main {

	public static void main(String[] args){
		System.out.println("Joueur 1 : ");
		String p1name=getPlayerName();
		Hero p1Hero=getHero();
		Player p1=new Player(p1name, p1Hero);
		
		System.out.println("Joueur 2, Nom?");
		String p2name=getPlayerName();
		Hero p2Hero=getHero();
		Player p2=new Player(p2name, p2Hero);

		Game game=new Game(p1,p2);
		int turn=1;
		while(true) {
			game.play(turn);
			turn++;
		}
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
