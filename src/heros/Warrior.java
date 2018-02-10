package heros;

import cards.Card;
import cards.WarriorCardFactory;
import game.Const;
import game.Targetable;

public class Warrior extends Hero {

	public Warrior() {
		super(Const.Heroes.WARRIOR);
	}

	@Override
	public void heroPower(Targetable target) {}

	@Override
	public Card pickCard() {
		// TODO Auto-generated method stub
		return WarriorCardFactory.getAleatoireCard();
	}
}
