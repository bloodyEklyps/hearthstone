package heros;

import game.Const;
import game.Targetable;

public class Paladin extends Hero {

	public Paladin(){
		super(Const.Heroes.PALADIN);
	}
	
	@Override
	public void heroPower(Targetable target) {}
}
