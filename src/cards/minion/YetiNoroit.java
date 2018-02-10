package cards.minion;

import observer.Observer;

public class YetiNoroit extends Minion {

	private YetiNoroit() {
		super("Yéti noroit", 4, null, 4, 5);
	}
	
	public static Minion createYetiNoroit(){
		return new YetiNoroit();
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
