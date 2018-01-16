package heros;

import game.Const;
import game.Targetable;

public class Mage extends Hero {
	
	public Mage() {
		super(Const.Heroes.MAGE);
	}

	@Override
	public void heroPower(Targetable target) {}
}
