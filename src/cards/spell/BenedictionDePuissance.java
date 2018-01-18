package cards.spell;

import cards.minion.Minion;
import game.Const;
import game.Player;
import game.Targetable;
import game.Utils;

public class BenedictionDePuissance extends Spell{

	private BenedictionDePuissance(){
		super("Bénédiction de puissance", 1, Const.Heroes.PALADIN);
	}
	
	public static Spell createBenedictionDePuissance(){
		return new BenedictionDePuissance();
	}

	@Override
	public boolean cast(Player caster) {
		Targetable target = Utils.selectTarget(caster, Const.Targets.MINIONS, Const.Side.ALL);
		if(target.getClass() != Minion.class){
			return false;
		} else {
			Minion m = ((Minion)target);
			m.setDamage(m.getDamage()+3);
			return true;
		}
	}
}
