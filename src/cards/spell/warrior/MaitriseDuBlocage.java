package cards.spell.warrior;

import cards.minion.common.Minion;
import cards.spell.Spell;
import game.Const;
import game.Player;
import game.Targetable;
import game.Utils;
import heros.Hero;

public class MaitriseDuBlocage extends Spell{

	private MaitriseDuBlocage() {
		super("Maitrise Du Blocage", 3);
	}

	public static Spell createMetamorphose(){
		return new MaitriseDuBlocage();
	}
	
	@Override
	public boolean cast(Player caster) {
		Hero hero=caster.getBoard().getHero();
		hero.setArmor(hero.getArmor()+5);
		caster.pickCard();
		return true;
	}

}
