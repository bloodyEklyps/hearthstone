package state;

import cards.minion.Minion;
import game.Targetable;

public class MinionSleepState implements MinionState {

	private Minion minion;
	
	public MinionSleepState(Minion minion) {
		super();
		this.minion = minion;
	}

	@Override
	public void attack(Targetable target) {
		System.out.println("Ce serviteur ne peut pas attaquer");
	}
	
	public String toString(){
		return "(Zz.)"+minion.getName()+":"+minion.getManaCost()+" "+minion.getDamage()+"/"+minion.getCurrentHealth();
	}

}
