package cards.minion;

public class ChargeMinion extends MinionDecorator{

	public ChargeMinion(Minion m) {
		super(m);
		this.setStateToAwake();
		this.setCharge(true);
	}

}
