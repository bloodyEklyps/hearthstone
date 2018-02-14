package cards;

import java.util.ArrayList;

import cards.minion.common.ChefDeRaid;
import cards.minion.common.ChevaucheurDeLoup;
import cards.minion.common.SanglierBrocheroc;
import cards.minion.common.SoldatDuCompteDeLOr;
import cards.minion.common.YetiNoroit;
import cards.minion.paladin.ChampionFrisselame;
import cards.spell.paladin.BenedictionDePuissance;
import cards.spell.paladin.Consecration;


public class PaladinCardFactory implements CardFactory{

	private final ArrayList<String> paladinCards;
	private final ArrayList<String> allCards;
	
	public PaladinCardFactory(){
		paladinCards = new ArrayList<String>();
		allCards = new ArrayList<String>();
		paladinCards.add("ChampionFrisselame");
		paladinCards.add("BenedictionDePuissance");
		paladinCards.add("Consecration");
		
		allCards.addAll(paladinCards);
		allCards.addAll(CommonCardFactory.commonCards);
	}
	
	public Card choseCard(String name){
		switch (name){
		case "ChampionFrisselame":
			return ChampionFrisselame.createChampionFrisselame();
		case "BenedictionDePuissance":
			return BenedictionDePuissance.createBenedictionDePuissance();
		case "Consecration":
			return Consecration.createConsecration();
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
