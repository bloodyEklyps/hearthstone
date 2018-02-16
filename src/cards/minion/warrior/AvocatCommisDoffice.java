package cards.minion.warrior;

import cards.minion.Minion;
import cards.minion.TauntMinion;

public class AvocatCommisDoffice extends Minion {

	private AvocatCommisDoffice() {
		super("Avocat Commis D'office", 2, 0, 7);
	}
	
	public static Minion createAvocatCommisDoffice(){
		return new TauntMinion(new AvocatCommisDoffice());
	}


}
