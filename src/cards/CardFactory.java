package cards;

import java.util.HashMap;
import java.util.Map;

import cards.minion.*;
import cards.spell.*;

public class CardFactory {

	private static final Map<String, Card> map = new HashMap<String, Card>();
	
	
	static {
		//minions
		map.put("SanglierBrocheroc", new SanglierBrocheroc());
		map.put("ChevaucheurDeLoup", new ChargeMinion(new ChevaucheurDeLoup()));
		map.put("SoldatDuCompteDeLOr", new TauntMinion(new SoldatDuCompteDeLOr()));
		map.put("ChefDeRaid", new ChefDeRaid());
		map.put("YetiNoroit", new YetiNoroit());
		
		
		//spells
		map.put("BenedictionDePuissance", new BenedictionDePuissance());
		
		/*TODO complete with other cards*/
	}
	
	public static Card getCard(String name){
		return map.get(name);
	}
}
