package cards.minion;

import game.Targetable;
import observer.Observer;

public class LifeStealMinion extends MinionDecorator {

	public LifeStealMinion(Minion m) {
		super(m);
	}
	
	public void attack(Targetable target){
		System.out.println("attack");
		System.out.println("heal hero");
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
