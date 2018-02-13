package cards.spell.paladin;

import cards.spell.Spell;
import game.Board;
import game.Game;
import game.Player;

public class Consecration extends Spell{

	private Consecration() {
		super("Consécration", 2);
	}
	
	public static Spell createConsecration(){
		return new Consecration();
	}

	@Override
	public boolean cast(Player caster) {
		Board ennemyBoard = Game.getEnnemy(caster).getBoard();
		ennemyBoard.aoe(2);
		ennemyBoard.getHero().takeDammage(2);;
		return true;
	}

}
