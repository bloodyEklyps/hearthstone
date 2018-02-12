package cards;

import java.util.HashMap;
import java.util.Map;

import cards.minion.*;
import cards.spell.*;

public class CommonCardFactory {


	public static final Map<String, Card> map = new HashMap<String, Card>();
	public static final Map<Integer, String> mapnumb = new HashMap<Integer, String>();

	
	static {
		//minions
		mapnumb.put(0,"SanglierBrocheroc");
		mapnumb.put(1,"ChevaucheurDeLoup");
		mapnumb.put(2,"SoldatDuCompteDeLOr");
		mapnumb.put(3,"ChefDeRaid");
		mapnumb.put(4,"YetiNoroit");
		
		
		//spells
		mapnumb.put(5,"BenedictionDePuissance");
		
	}
	static {
		//minions
		map.put("SanglierBrocheroc", SanglierBrocheroc.createSanglierBrocheroc());
		map.put("ChevaucheurDeLoup", ChevaucheurDeLoup.createChevaucheurDeLoup());
		map.put("SoldatDuCompteDeLOr", SoldatDuCompteDeLOr.createSoldatDuCompteDeLOr());
		map.put("ChefDeRaid", ChefDeRaid.createChefDeRaid());
		map.put("YetiNoroit", YetiNoroit.createYetiNoroit());
		
		
		//spells
		map.put("BenedictionDePuissance", BenedictionDePuissance.createBenedictionDePuissance());
		
	}
	
	public static Card getCard(String name){
		return map.get(name);
		
	}
	public static Card getAleatoireCard(){
		int alea=(int) (Math.random()*(mapnumb.size()));
		return map.get(mapnumb.get(alea));
		
	}
}
