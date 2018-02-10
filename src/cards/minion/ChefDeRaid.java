package cards.minion;

import observer.Observer;

public class ChefDeRaid extends Minion{

	private ChefDeRaid() {
		super("Chef de raid", 3, null, 2, 2);
	}
	
	public static Minion createChefDeRaid(){
		return new ChefDeRaid();
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
