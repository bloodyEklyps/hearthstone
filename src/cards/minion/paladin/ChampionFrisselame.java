package cards.minion.paladin;


import cards.minion.common.ChargeMinion;
import cards.minion.common.LifeStealMinion;
import cards.minion.common.Minion;

public class ChampionFrisselame extends Minion {

	private ChampionFrisselame() {
		super("Champion Frisselame", 4, 3, 2);
	}
	
	public static Minion createChampionFrisselame(){
		return new LifeStealMinion(new ChargeMinion(new ChampionFrisselame()));
	}


}
