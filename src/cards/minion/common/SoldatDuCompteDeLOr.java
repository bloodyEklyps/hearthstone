package cards.minion.common;

import cards.minion.Minion;
import cards.minion.TauntMinion;

public class SoldatDuCompteDeLOr extends Minion{

	private SoldatDuCompteDeLOr() {
		super("Soldat du Compté de l'or", 1, 1, 2);
	}
	
	public static Minion createSoldatDuCompteDeLOr(){
		return new TauntMinion(new SoldatDuCompteDeLOr());
	}


}
