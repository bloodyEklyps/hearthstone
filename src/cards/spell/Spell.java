package cards.spell;

import cards.Card;
import game.Const;
import game.Player;

public abstract class Spell extends Card {

	public Spell(String name, int manaCost, Const.Heroes hero) {
		super(name, manaCost, hero);
	}

	//return false whenever you can't cast the spell
	public abstract boolean cast(Player caster);

	@Override
	public String toString() {
		return this.getName()+" "+this.getManaCost();
	}
	
	
}
