package cards.minion.common;


public class ChefDeRaid extends Minion{

	private ChefDeRaid() {
		super("Chef de raid", 3, 2, 2);
	}
	
	public static Minion createChefDeRaid(){
		return new ChefDeRaid();
	}
	
}
