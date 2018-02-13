package cards.minion;

import game.Targetable;

public class LifeStealMinion extends MinionDecorator {

	public LifeStealMinion(Minion m) {
		super(m);
	}
	
	public void attack(Targetable target){
		System.out.println("attack");
		System.out.println("heal hero");
	}



}
