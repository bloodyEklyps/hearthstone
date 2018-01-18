package cards.spell;

import cards.minion.Reflet;
import game.Const;
import game.Player;

public class ImageMiroir extends Spell{

	private ImageMiroir() {
		super("Image miroir", 1, Const.Heroes.MAGE);
		// TODO Auto-generated constructor stub
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
