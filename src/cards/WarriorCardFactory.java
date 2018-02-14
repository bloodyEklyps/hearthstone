package cards;

import java.util.ArrayList;

import cards.minion.common.ChefDeRaid;
import cards.minion.common.ChevaucheurDeLoup;
import cards.minion.common.SanglierBrocheroc;
import cards.minion.common.SoldatDuCompteDeLOr;
import cards.minion.common.YetiNoroit;
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
		}
		return null;
	}
		
	public Card getRandomCard(){
		int alea=(int) (Math.random()*(allCards.size()));
		return choseCard(allCards.get(alea));
	}
}
