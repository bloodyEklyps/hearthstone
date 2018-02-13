package cards;

import java.util.ArrayList;
import cards.minion.warrior.AvocatCommisDoffice;
import cards.spell.warrior.MaitriseDuBlocage;
import cards.spell.warrior.Tourbillon;

public class WarriorCardFactory {
	public static final ArrayList<Card> warriorCards = new ArrayList<Card>();
	public static final ArrayList<Card> allCards = new ArrayList<Card>();
	
	static {
		warriorCards.add(Tourbillon.createTourbillon());
		warriorCards.add(MaitriseDuBlocage.createMaitriseDuBlocage());
		warriorCards.add(AvocatCommisDoffice.createAvocatCommisDoffice());
		
		allCards.addAll(warriorCards);
		allCards.addAll(CommonCardFactory.commonCards);
	}
	
	public static Card getRandomCard(){
		int alea=(int) (Math.random()*(allCards.size()));
		return allCards.get(alea);
		
	}
}
