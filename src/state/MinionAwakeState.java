package state;

import cards.minion.Minion;

public class MinionAwakeState implements MinionState {

	private Minion minion;
	
	public MinionAwakeState(Minion minion) {
		super();
		this.minion = minion;
	}
	@Override
	public void attack() {
		System.out.println("attacking...");
	}
	
	public String toString(){
		return minion.getName()+":"+minion.getManaCost()+" "+minion.getDamage()+"/"+minion.getCurrentHealth();
	}

}
