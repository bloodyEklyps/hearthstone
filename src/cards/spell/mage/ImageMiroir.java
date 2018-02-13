package cards.spell.mage;

import cards.minion.special.Reflet;
import cards.spell.Spell;
import game.Player;

public class ImageMiroir extends Spell{

	private ImageMiroir() {
		super("Image Miroir", 1);
	}

	public static Spell createImageMiroir(){
		return new ImageMiroir();
	}
	
	@Override
	public boolean cast(Player caster) {
		caster.getBoard().summon(Reflet.createReflet());
		caster.getBoard().summon(Reflet.createReflet());
		return true;
	}

}
