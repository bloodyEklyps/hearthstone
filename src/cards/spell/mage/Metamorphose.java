package cards.spell.mage;

import java.util.ArrayList;

import cards.minion.Minion;
import cards.minion.special.Mouton;
import cards.spell.Spell;
import game.Const;
import game.Player;
import game.Targetable;
import game.Utils;

public class Metamorphose extends Spell{

	private Metamorphose() {
		super("Métamorphose", 4);
	}

	public static Spell createMetamorphose(){
		return new Metamorphose();
	}

	@Override
	public boolean cast(Player caster) {
		System.out.println("Quelle carte métamorphoser?");
		Targetable target = Utils.selectTarget(caster, Const.Targets.MINIONS, Const.Side.ALL);
		if(target == null){
			return false;
		}
		Minion m = ((Minion)target);
		ArrayList<Minion> troops = caster.getBoard().getTroops();
		troops.set(troops.indexOf(m), Mouton.createMouton());
		return true;


	}

}
