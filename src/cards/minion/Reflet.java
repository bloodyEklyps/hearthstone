package cards.minion;

import observer.Observer;

public class Reflet extends Minion {

	private Reflet(){
		super("Reflet", 1, null, 0, 2);
	}
	
	public static Minion createReflet(){
		return new TauntMinion(new Reflet());
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
