package cards;

import java.util.ArrayList;

import cards.spell.mage.ExplosionDesArcanes;
import cards.spell.mage.ImageMiroir;
import cards.spell.mage.Metamorphose;


public class MageCardFactory {

	public static final ArrayList<Card> mageCards = new ArrayList<Card>();
	public static final ArrayList<Card> allCards = new ArrayList<Card>();
	
	static {
		mageCards.add(ExplosionDesArcanes.createExplosionDesArcanes());
		mageCards.add(ImageMiroir.createImageMiroir());
		mageCards.add(Metamorphose.createMetamorphose());
		
		allCards.addAll(mageCards);
		allCards.addAll(CommonCardFactory.commonCards);
	}
	
	public static Card getRandomCard(){
		int alea=(int) (Math.random()*(allCards.size()));
		return allCards.get(alea);
		
	}
}
