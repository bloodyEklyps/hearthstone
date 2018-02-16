package heros;

import cards.WarriorCardFactory;
import game.Const;
import game.Player;

public class Warrior extends Hero {

	public Warrior() {
		super(Const.Heroes.WARRIOR, new WarriorCardFactory());
	}

	@Override
	public void heroPower(Player caster) {
		this.setArmor(this.getArmor()+2);
	}
}
