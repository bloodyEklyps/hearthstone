package cards.spell;

import cards.minion.Minion;
import game.Const;
import game.Const.Heroes;
import game.Player;

public class ExplosionDesArcanes extends Spell{

	public ExplosionDesArcanes() {
		super("Explosion des arcanes", 2, Const.Heroes.MAGE);
	}

	@Override
	public boolean cast(Minion target, Player caster) {
		--
		/*TODO*/
		//get board, or pass it in params
		return false;
	}

}
