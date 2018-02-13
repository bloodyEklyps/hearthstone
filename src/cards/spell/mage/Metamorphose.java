package cards.spell.mage;

import cards.minion.common.Minion;
import cards.spell.Spell;
import game.Const;
import game.Player;
import game.Targetable;
import game.Utils;

public class Metamorphose extends Spell{

	private Metamorphose() {
		super("MÃ©tamorphose", 4);
	}

	public static Spell createMetamorphose(){
		return new Metamorphose();
	}

	@Override
	public boolean cast(Player caster) {
		System.out.println("Quelle carte métamorphoser?");
		Targetable target = Utils.selectTarget(caster, Const.Targets.MINIONS, Const.Side.ALL);
		Minion m = ((Minion)target);
		m.setDamage(1);
		m.setCurrentHealth(1);
		m.setHealthMax(1);
		return true;


	}

}
