package cards;

import java.util.ArrayList;

import cards.minion.common.*;

public class CommonCardFactory {
	public static final ArrayList<Card> commonCards = new ArrayList<Card>();

	static {
		commonCards.add(SanglierBrocheroc.createSanglierBrocheroc());
		commonCards.add(ChevaucheurDeLoup.createChevaucheurDeLoup());
		commonCards.add(SoldatDuCompteDeLOr.createSoldatDuCompteDeLOr());
		commonCards.add(ChefDeRaid.createChefDeRaid());
		commonCards.add(YetiNoroit.createYetiNoroit());
	}
	
	public static Card getRandomCard(){
		int alea=(int) (Math.random()*(commonCards.size()));
		return commonCards.get(alea);
		
	}
}
