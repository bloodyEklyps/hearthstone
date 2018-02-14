package heros;

import cards.PaladinCardFactory;
import cards.minion.special.RecrueDeLaMainDArgent;
import game.Board;
import game.Const;
import game.Player;

public class Paladin extends Hero {

	public Paladin(){
		super(Const.Heroes.PALADIN, new PaladinCardFactory());
	}
	
	@Override
	public void heroPower(Player caster) {
		Board board = caster.getBoard();
		board.getTroops().add(RecrueDeLaMainDArgent.createRecrueDeLaMainDArgent());
	}
}
