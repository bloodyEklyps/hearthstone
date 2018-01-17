package cards.spell;

import cards.minion.Minion;
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
	public boolean cast(Minion target, Player caster) {
		--
		/*TODO*/
		//summon 2 0/2 (create 0/2 minion)
		return false;
	}

}
