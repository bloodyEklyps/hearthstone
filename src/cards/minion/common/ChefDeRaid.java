package cards.minion.common;

import cards.minion.Minion;

public class ChefDeRaid extends Minion{

	private ChefDeRaid() {
		super("Chef de raid", 3, 2, 2);
	}
	
	public static Minion createChefDeRaid(){
		return new ChefDeRaid();
	}
	
}
