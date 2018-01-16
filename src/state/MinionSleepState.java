package state;

import cards.minion.Minion;

public class MinionSleepState implements MinionState {

	private Minion minion;
	
	public MinionSleepState(Minion minion) {
		super();
		this.minion = minion;
	}

	@Override
	public void attack() {
		System.out.println("can't attack");
	}
	
	public String toString(){
		return "(Zz.)"+minion.getName()+":"+minion.getManaCost()+" "+minion.getDamage()+"/"+minion.getCurrentHealth();
	}

}
