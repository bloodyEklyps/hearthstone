package cards.minion;

import observer.Observer;

public class SanglierBrocheroc extends Minion {

	private SanglierBrocheroc(){
		super("Sanglier brocheroc", 1, null, 1, 1);
	}
	
	public static Minion createSanglierBrocheroc(){
		return new SanglierBrocheroc();
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
