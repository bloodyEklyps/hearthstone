package game;

import java.util.Scanner;

import heros.Hero;
import heros.Mage;
import heros.Paladin;
import heros.Warrior;

public class Main {

	public static void main(String[] args){
		System.out.println("Joueur 1 quelle est votre nom?");
		String p1name=getPlayerName();
		System.out.println("Quel sera votre héro?");
		System.out.println("1-Mage   2-Paladin   3-Warrior");
		Hero p1Hero=getHero();
		Player p1=new Player(p1name, p1Hero);
		
		System.out.println("Joueur 2 quelle est votre nom?");
		String p2name=getPlayerName();
		System.out.println("Quel sera votre héro?");
		System.out.println("1-Mage   2-Paladin   3-Warrior");
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
