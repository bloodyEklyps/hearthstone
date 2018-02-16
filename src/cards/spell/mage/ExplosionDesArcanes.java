package cards.spell.mage;

import cards.spell.Spell;
import game.Board;
import game.Game;
import game.Player;

public class ExplosionDesArcanes extends Spell{

	private ExplosionDesArcanes() {
		super("Explosion des arcanes", 2);
	}
	
	public static Spell createExplosionDesArcanes(){
		return new ExplosionDesArcanes();
	}

	@Override
	public boolean cast(Player caster) {
		Board ennemyBoard = Game.getEnnemy(caster).getBoard();
		ennemyBoard.aoe(1);
		return true;
	}

}
