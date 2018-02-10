package cards.minion;

import observer.Observer;
import state.MinionAwakeState;

public class ChargeMinion extends MinionDecorator{

	public ChargeMinion(Minion m) {
		super(m);
		this.setState(new MinionAwakeState(m));
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
