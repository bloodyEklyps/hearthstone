package cards.spell;

import cards.minion.Minion;
import game.Const;
import game.Player;

public class Metamorphose extends Spell{

	private Metamorphose() {
		super("Métamorphose", 4, Const.Heroes.MAGE);
	}

	public static Spell createMetamorphose(){
		return new Metamorphose();
	}
	
	@Override
	public boolean cast(Minion target, Player caster) {
		target.setDamage(1);
		target.setCurrentHealth(1);
		target.setHealthMax(1);
		return true;
	}

}
