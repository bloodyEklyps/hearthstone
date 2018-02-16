package cards.minion;


public class TauntMinion extends MinionDecorator {

	public TauntMinion(Minion m) {
		super(m);
		this.setTaunt(true);
	}
}
