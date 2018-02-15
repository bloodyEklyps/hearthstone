package cards;

import java.util.ArrayList;

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
		default:
			return CommonCardFactory.choseCard(name);
		}
	}
	
	public Card getRandomCard(){
		int alea=(int) (Math.random()*(allCards.size()));
		return choseCard(allCards.get(alea));
	}
}
