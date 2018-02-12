package cards.minion;


public class SoldatDuCompteDeLOr extends Minion{

	private SoldatDuCompteDeLOr() {
		super("Soldat du Compté de l'or", 1, null, 1, 2);
	}
	
	public static Minion createSoldatDuCompteDeLOr(){
		return new TauntMinion(new SoldatDuCompteDeLOr());
	}


}
