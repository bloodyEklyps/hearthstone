package cards.spell;

import cards.minion.Minion;
import game.Const;
import game.Player;
import game.Targetable;
import game.Utils;

public class Metamorphose extends Spell{

	private Metamorphose() {
		super("Métamorphose", 4, Const.Heroes.MAGE);
	}

	public static Spell createMetamorphose(){
		return new Metamorphose();
	}
	
	@Override
	public boolean cast(Player caster) {
		Targetable target = Utils.selectTarget(caster, Const.Targets.MINIONS, Const.Side.ALL);
		if(target.getClass() != Minion.class){
			return false;
		} else {
			Minion m = ((Minion)target);
			m.setDamage(1);
			m.setCurrentHealth(1);
			m.setHealthMax(1);
			return true;
		}

	}

}
