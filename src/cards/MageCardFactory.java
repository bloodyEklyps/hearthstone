package cards;

import java.util.ArrayList;

import cards.minion.common.ChefDeRaid;
import cards.minion.common.ChevaucheurDeLoup;
import cards.minion.common.SanglierBrocheroc;
import cards.minion.common.SoldatDuCompteDeLOr;
import cards.minion.common.YetiNoroit;
import cards.spell.mage.ExplosionDesArcanes;
import cards.spell.mage.ImageMiroir;
import cards.spell.mage.Metamorphose;

public class MageCardFactory implements CardFactory{
	
	private final ArrayList<String> mageCards;
	private final ArrayList<String> allCards;
	
	public MageCardFactory(){
		mageCards = new ArrayList<String>();
		allCards = new ArrayList<String>();
		mageCards.add("ExplosionDesArcanes");
		mageCards.add("ImageMiroir");
		mageCards.add("Metamorphose");
		
		allCards.addAll(mageCards);
		allCards.addAll(CommonCardFactory.commonCards);
	}
	
	public Card choseCard(String name){
		switch (name){
		case "ExplosionDesArcanes":
			return ExplosionDesArcanes.createExplosionDesArcanes();
		case "ImageMiroir":
			return ImageMiroir.createImageMiroir();
		case "Metamorphose":
			return Metamorphose.createMetamorphose();
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
