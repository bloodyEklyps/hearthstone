package cards.minion.common;

import cards.minion.ChargeMinion;
import cards.minion.Minion;;

public class ChevaucheurDeLoup extends Minion {

	private ChevaucheurDeLoup(){
		super("Chevaucheur de loup", 3, 3, 1);
	}
	
	public static Minion createChevaucheurDeLoup(){
		return new ChargeMinion(new ChevaucheurDeLoup());
	}

}
