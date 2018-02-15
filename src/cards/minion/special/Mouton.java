package cards.minion.special;

import cards.minion.Minion;

public class Mouton extends Minion {

	private Mouton(){
		super("Mouton", 1, 1, 1);
	}
	
	public static Minion createMouton(){
		return new Mouton();
	}

}
