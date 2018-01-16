package cards.spell;

import cards.minion.Minion;
import game.Const;
import game.Player;

public class Metamorphose extends Spell{

	public Metamorphose() {
		super("Métamorphose", 4, Const.Heroes.MAGE);
	}

	@Override
	public boolean cast(Minion target, Player caster) {
		target.setDamage(1);
		target.setCurrentHealth(1);
		target.setHealthMax(1);
		return true;
	}

}
