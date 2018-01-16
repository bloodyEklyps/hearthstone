package cards.minion;

import state.MinionAwakeState;

public class ChargeMinion extends MinionDecorator{

	public ChargeMinion(Minion m) {
		super(m);
		this.setState(new MinionAwakeState(m));
	}
}
