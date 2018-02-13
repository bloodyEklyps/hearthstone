package cards.spell.warrior;

import cards.spell.Spell;
import game.Board;
import game.Const;
import game.Game;
import game.Player;

public class Tourbillon extends Spell{

	private Tourbillon() {
		super("Tourbillon", 1);
	}
	
	public static Spell createExplosionDesArcanes(){
		return new Tourbillon();
	}

	@Override
	public boolean cast(Player caster) {
		Board ennemyBoard = Game.getEnnemy(caster).getBoard();
		Board allyBoard = caster.getBoard();
		ennemyBoard.aoe(1);
		allyBoard.aoe(1);
		return true;
	}

}
