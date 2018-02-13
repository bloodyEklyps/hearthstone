package cards.minion.paladin;


import cards.minion.common.ChargeMinion;
import cards.minion.common.LifeStealMinion;
import cards.minion.common.Minion;
import game.Const;

public class ChampionFrisselame extends Minion {

	private ChampionFrisselame() {
		super("Champion Frisselame", 4, 3, 2);
	}
	
	public static Minion createChampionFrisselame(){
		return new ChargeMinion(new LifeStealMinion(new ChampionFrisselame()));
	}


}
