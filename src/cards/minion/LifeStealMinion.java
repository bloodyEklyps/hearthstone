package cards.minion;

import game.Targetable;

public class LifeStealMinion extends MinionDecorator {

	public LifeStealMinion(Minion m) {
		super(m);
	}
	
	public void attack(Targetable target){
		this.getState().attack(target);
	}



}
