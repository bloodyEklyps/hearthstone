package cards.spell;

import cards.minion.Minion;
import game.Const;
import game.Player;

public class ImageMiroir extends Spell{

	public ImageMiroir() {
		super("Image miroir", 1, Const.Heroes.MAGE);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean cast(Minion target, Player caster) {
		--
		/*TODO*/
		//summon 2 0/2 (create 0/2 minion)
		return false;
	}

}
