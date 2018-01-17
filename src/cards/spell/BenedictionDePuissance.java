package cards.spell;

import cards.minion.Minion;
import game.Const;
import game.Player;

public class BenedictionDePuissance extends Spell{

	private BenedictionDePuissance(){
		super("Bénédiction de puissance", 1, Const.Heroes.PALADIN);
	}
	
	public static Spell createBenedictionDePuissance(){
		return new BenedictionDePuissance();
	}

	@Override
	public boolean cast(Minion target, Player caster) {
		target.setDamage(target.getDamage()+3);
		return true;
	}
}
