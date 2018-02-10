package cards.minion;

import observer.Observer;

public class SoldatDuCompteDeLOr extends Minion{

	private SoldatDuCompteDeLOr() {
		super("Soldat du Compté de l'or", 1, null, 1, 2);
	}
	
	public static Minion createSoldatDuCompteDeLOr(){
		return new TauntMinion(new SoldatDuCompteDeLOr());
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
