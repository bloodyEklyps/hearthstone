package cards.minion.special;

import cards.minion.common.Minion;

public class RecrueDeLaMainDArgent extends Minion {

	private RecrueDeLaMainDArgent(){
		super("Recrue de la main d'argent", 1, 1, 1);
	}
	
	public static Minion createRecrueDeLaMainDArgent(){
		return new RecrueDeLaMainDArgent();
	}

}
