package heros;

import cards.Card;
import cards.MageCardFactory;
import cards.PaladinCardFactory;
import game.Const;
import game.Targetable;

public class Paladin extends Hero {

	public Paladin(){
		super(Const.Heroes.PALADIN);
	}
	
	@Override
	public void heroPower(Targetable target) {}

	@Override
	public Card pickCard() {
		return PaladinCardFactory.getAleatoireCard();

	}
}
