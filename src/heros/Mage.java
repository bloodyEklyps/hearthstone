package heros;

import cards.MageCardFactory;
import game.Const;
import game.Player;
import game.Targetable;
import game.Utils;

public class Mage extends Hero {
	
	public Mage() {
		super(Const.Heroes.MAGE, new MageCardFactory());
	}

	@Override
	public void heroPower(Player caster) {
		Targetable target = Utils.selectTarget(caster,
				Const.Targets.CHARACTERS, Const.Side.ENEMIES);
		target.takeDammage(1);

	}
}
