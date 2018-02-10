package cards.minion;

import observer.Observer;

public class ChevaucheurDeLoup extends Minion {

	private ChevaucheurDeLoup(){
		super("Chevaucheur de loup", 3, null, 3, 1);
	}
	
	public static Minion createChevaucheurDeLoup(){
		return new ChargeMinion(new ChevaucheurDeLoup());
	}

	@Override
	public void addObserver(Observer obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Observer obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
}
