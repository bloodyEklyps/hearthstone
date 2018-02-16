package cards;

import java.util.ArrayList;

import cards.minion.warrior.AvocatCommisDoffice;
import cards.spell.warrior.MaitriseDuBlocage;
import cards.spell.warrior.Tourbillon;

public class WarriorCardFactory implements CardFactory{
	
	private final ArrayList<String> warriorCards;
	private final ArrayList<String> allCards;
	
	public WarriorCardFactory(){
		warriorCards = new ArrayList<String>();
		allCards = new ArrayList<String>();
		warriorCards.add("Tourbillon");
		warriorCards.add("MaitriseDuBlocage");
		warriorCards.add("AvocatCommisDoffice");
		
		allCards.addAll(warriorCards);
		allCards.addAll(CommonCardFactory.commonCards);
	}
	
	public Card choseCard(String name){
		switch (name){
		case "Tourbillon":
			return Tourbillon.createTourbillon();
		case "MaitriseDuBlocage":
			return MaitriseDuBlocage.createMaitriseDuBlocage();
		case "AvocatCommisDoffice":
			return AvocatCommisDoffice.createAvocatCommisDoffice();
		default:
			return CommonCardFactory.choseCard(name);
		}
	}
		
	public Card getRandomCard(){
		int alea=(int) (Math.random()*(allCards.size()));
		return choseCard(allCards.get(alea));
	}
}
