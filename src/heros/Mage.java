package heros;

import cards.Card;
import cards.MageCardFactory;
import game.Const;
import game.Targetable;

public class Mage extends Hero {
	
	public Mage() {
		super(Const.Heroes.MAGE);
	}

	@Override
	public void heroPower(Targetable target) {}
	
	public Card pickCard() {
		return MageCardFactory.getAleatoireCard();
		
	}
}
