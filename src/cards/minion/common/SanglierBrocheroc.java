package cards.minion.common;

import cards.minion.Minion;

public class SanglierBrocheroc extends Minion {

	private SanglierBrocheroc(){
		super("Sanglier brocheroc", 1, 1, 1);
	}
	
	public static Minion createSanglierBrocheroc(){
		return new SanglierBrocheroc();
	}

	
}
