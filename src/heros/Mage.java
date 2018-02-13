package heros;

import cards.Card;
import cards.MageCardFactory;
import game.Const;
import game.Player;
import game.Targetable;
import game.Utils;

public class Mage extends Hero {
	
	public Mage() {
		super(Const.Heroes.MAGE);
	}

	@Override
	public void heroPower(Player caster) {
		Targetable target = Utils.selectTarget(caster,
				Const.Targets.CHARACTERS, Const.Side.ENEMIES);
		target.takeDammage(1);

	}
	
	public Card pickCard() {
		return MageCardFactory.getRandomCard();
		
	}
}
