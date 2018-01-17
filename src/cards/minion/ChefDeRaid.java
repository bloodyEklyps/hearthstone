package cards.minion;

public class ChefDeRaid extends Minion{

	private ChefDeRaid() {
		super("Chef de raid", 3, null, 2, 2);
	}
	
	public static Minion createChefDeRaid(){
		return new ChefDeRaid();
	}
	
}
