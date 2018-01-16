package heros;

import game.Const;
import game.Targetable;

public class Warrior extends Hero {

	public Warrior() {
		super(Const.Heroes.WARRIOR);
	}

	@Override
	public void heroPower(Targetable target) {}
}
