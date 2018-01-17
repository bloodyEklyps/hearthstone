package cards.spell;

import cards.minion.Minion;
import game.Board;
import game.Const;
import game.Game;
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
		Board ennemyBoard = Game.getEnnemy(caster).getBoard();
		ennemyBoard.aoe(1);
		return true;
	}

}
