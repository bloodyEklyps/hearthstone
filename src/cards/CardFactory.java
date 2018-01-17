package cards;

import java.util.HashMap;
import java.util.Map;

import cards.minion.*;
import cards.spell.*;

public class CardFactory {

	private static final Map<String, Card> map = new HashMap<String, Card>();
	
	
	static {
		//minions
		map.put("SanglierBrocheroc", SanglierBrocheroc.createSanglierBrocheroc());
		map.put("ChevaucheurDeLoup", ChevaucheurDeLoup.createChevaucheurDeLoup());
		map.put("SoldatDuCompteDeLOr", SoldatDuCompteDeLOr.createSoldatDuCompteDeLOr());
		map.put("ChefDeRaid", ChefDeRaid.createChefDeRaid());
		map.put("YetiNoroit", YetiNoroit.createYetiNoroit());
		
		
		//spells
		map.put("BenedictionDePuissance", BenedictionDePuissance.createBenedictionDePuissance());
		
		/*TODO complete with other cards*/
	}
	
	public static Card getCard(String name){
		return map.get(name);
	}
}
