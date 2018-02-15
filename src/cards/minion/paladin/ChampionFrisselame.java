package cards.minion.paladin;


import cards.minion.LifeStealMinion;
import cards.minion.Minion;
import cards.minion.ChargeMinion;

public class ChampionFrisselame extends Minion {

	private ChampionFrisselame() {
		super("Champion Frisselame", 4, 3, 2);
	}
	
	public static Minion createChampionFrisselame(){
		return new LifeStealMinion(new ChargeMinion(new ChampionFrisselame()));
	}


}
