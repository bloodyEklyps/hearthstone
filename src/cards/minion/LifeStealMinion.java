package cards.minion;

public class LifeStealMinion extends MinionDecorator {

	public LifeStealMinion(Minion m) {
		super(m);
		this.setLifesteal(true);
	}
}
