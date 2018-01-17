package cards.spell;

import cards.minion.Minion;
import game.Const;
import game.Const.Heroes;
import game.Player;

public class ExplosionDesArcanes extends Spell{

	private ExplosionDesArcanes() {
		super("Explosion des arcanes", 2, Const.Heroes.MAGE);
	}
	
	public static Spell createExplosionDesArcanes(){
		return new ExplosionDesArcanes();
	}

	@Override
	public boolean cast(Minion target, Player caster) {
		--
		/*TODO*/
		//get board, or pass it in params
		return false;
	}

}
