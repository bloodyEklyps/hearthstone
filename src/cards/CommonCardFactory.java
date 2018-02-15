package cards;

import java.util.ArrayList;

import cards.minion.common.ChefDeRaid;
import cards.minion.common.ChevaucheurDeLoup;
import cards.minion.common.SanglierBrocheroc;
import cards.minion.common.SoldatDuCompteDeLOr;
import cards.minion.common.YetiNoroit;

public class CommonCardFactory {
	public static final ArrayList<String> commonCards = new ArrayList<String>();

	static {
		commonCards.add("SanglierBrocheroc");
		commonCards.add("ChevaucheurDeLoup");
		commonCards.add("SoldatDuCompteDeLOr");
		commonCards.add("ChefDeRaid");
		commonCards.add("YetiNoroit");
	}
	
	public static Card choseCard(String name){
		switch(name){
		case "SanglierBrocheroc":
			return SanglierBrocheroc.createSanglierBrocheroc();
		case "ChevaucheurDeLoup":
			return ChevaucheurDeLoup.createChevaucheurDeLoup();
		case "SoldatDuCompteDeLOr":
			return SoldatDuCompteDeLOr.createSoldatDuCompteDeLOr();
		case "ChefDeRaid":
			return ChefDeRaid.createChefDeRaid();
		case "YetiNoroit":
			return YetiNoroit.createYetiNoroit();
		default:
			return null;
		}
	}
}
