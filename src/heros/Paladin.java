package heros;

import cards.Card;
import cards.PaladinCardFactory;
import cards.minion.special.RecrueDeLaMainDArgent;
import game.Board;
import game.Const;
import game.Player;

public class Paladin extends Hero {

	public Paladin(){
		super(Const.Heroes.PALADIN);
	}
	
	@Override
	public void heroPower(Player caster) {
		Board board = caster.getBoard();
		board.getTroops().add(RecrueDeLaMainDArgent.createRecrueDeLaMainDArgent());
	}

	@Override
	public Card pickCard() {
		return PaladinCardFactory.getAleatoireCard();
	}
}
