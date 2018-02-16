package state;

import cards.minion.Minion;
import game.Targetable;

public class MinionAwakeState implements MinionState {

	private Minion minion;
	
	public MinionAwakeState(Minion minion) {
		super();
		this.minion = minion;
	}
	@Override
	public void attack(Targetable targ) {
		targ.takeDammage(minion.getDamage());
		if(targ instanceof Minion){
			minion.takeDammage(((Minion) targ).getDamage());
		}
	}
	
	public String toString(){
		return minion.getName()+":"+minion.getManaCost()+" "+minion.getDamage()+"/"+minion.getCurrentHealth() 
		+"("+((minion.isCharge()) ? "Charge" : "")
		+"("+((minion.isTaunt()) ? "Provocation" : "")
		+"("+((minion.isLifesteal()) ? "Vol de vie" : "")+ ")";
	}

}
