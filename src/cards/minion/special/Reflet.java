package cards.minion.special;

import cards.minion.common.Minion;
import cards.minion.common.TauntMinion;

public class Reflet extends Minion {

	private Reflet(){
		super("Reflet", 1, 0, 2);
	}
	
	public static Minion createReflet(){
		return new TauntMinion(new Reflet());
	}

}
