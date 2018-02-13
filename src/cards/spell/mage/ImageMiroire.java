package cards.spell.mage;

import cards.minion.common.Minion;
import cards.minion.special.Reflet;
import cards.spell.Spell;
import game.Const;
import game.Player;
import game.Targetable;
import game.Utils;

public class ImageMiroire extends Spell{

	private ImageMiroire() {
		super("Image Miroire", 1);
	}

	public static Spell createMetamorphose(){
		return new ImageMiroire();
	}
	
	@Override
	public boolean cast(Player caster) {
		caster.getBoard().summon(Reflet.createReflet());
		caster.getBoard().summon(Reflet.createReflet());
		return true;
	}

}
