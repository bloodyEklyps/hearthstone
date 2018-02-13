package cards.minion;


public class RecrueDeLaMainDArgent extends Minion {

	private RecrueDeLaMainDArgent(){
		super("Recrue de la main d'argent", 1, null, 1, 1);
	}
	
	public static Minion createRecrueDeLaMainDArgent(){
		return new RecrueDeLaMainDArgent();
	}

}
