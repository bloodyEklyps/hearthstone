package cards;

import java.util.ArrayList;

import cards.minion.paladin.ChampionFrisselame;
import cards.spell.paladin.*;

public class PaladinCardFactory {

	public static final ArrayList<Card> paladinCards = new ArrayList<Card>();
	public static final ArrayList<Card> allCards = new ArrayList<Card>();
	
	static {
		paladinCards.add(ChampionFrisselame.createChampionFrisselame());
		paladinCards.add(BenedictionDePuissance.createBenedictionDePuissance());
		paladinCards.add(Consecration.createConsecration());
		
		allCards.addAll(paladinCards);
		allCards.addAll(CommonCardFactory.commonCards);
	}
	
	public static Card getRandomCard(){
		int alea=(int) (Math.random()*(allCards.size()));
		return allCards.get(alea);
		
	}
}
