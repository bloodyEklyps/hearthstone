package cards.minion;

public class Reflet extends Minion {

	private Reflet(){
		super("Reflet", 1, null, 0, 2);
	}
	
	public static Minion createReflet(){
		return new TauntMinion(new Reflet());
	}
}
