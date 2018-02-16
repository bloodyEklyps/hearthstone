package cards.minion.special;

import cards.minion.Minion;
import cards.minion.TauntMinion;

public class Reflet extends Minion {

	private Reflet(){
		super("Reflet", 1, 0, 2);
	}
	
	public static Minion createReflet(){
		return new TauntMinion(new Reflet());
	}

}
