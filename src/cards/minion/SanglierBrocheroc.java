package cards.minion;

public class SanglierBrocheroc extends Minion {

	private SanglierBrocheroc(){
		super("Sanglier brocheroc", 1, null, 1, 1);
	}
	
	public static Minion createSanglierBrocheroc(){
		return new SanglierBrocheroc();
	}
}
