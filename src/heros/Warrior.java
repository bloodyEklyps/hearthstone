package heros;

import cards.Card;
import cards.WarriorCardFactory;
import game.Const;
import game.Player;

public class Warrior extends Hero {

	public Warrior() {
		super(Const.Heroes.WARRIOR);
	}

	@Override
	public void heroPower(Player caster) {
		this.setArmor(this.getArmor()+2);
	}

	@Override
	public Card pickCard() {
		return WarriorCardFactory.getRandomCard();
	}
}
