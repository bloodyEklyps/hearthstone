package cards.spell.warrior;


import cards.spell.Spell;
import game.Player;
import heros.Hero;

public class MaitriseDuBlocage extends Spell{

	private MaitriseDuBlocage() {
		super("Maitrise Du Blocage", 3);
	}

	public static Spell createMaitriseDuBlocage(){
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
