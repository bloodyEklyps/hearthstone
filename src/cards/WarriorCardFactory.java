package cards;

import java.util.HashMap;
import java.util.Map;

import cards.minion.*;
import cards.spell.*;

public class WarriorCardFactory {


	private static final Map<String, Card> map = new HashMap<String, Card>();
	private static final Map<Integer, String> mapnumb = new HashMap<Integer, String>();

	
	static {
		//minions
		map.putAll(CommonCardFactory.map);
		
		
		//spells

		
		/*TODO complete with other cards*/
	}
	static {
		//minions
		mapnumb.putAll(CommonCardFactory.mapnumb);
		
		
		//spells
		
		/*TODO complete with other cards*/
	}
	
	public static Card getCard(String name){
		return map.get(name);
		
	}
	public static Card getAleatoireCard(){
		int alea=(int) (Math.random()*(mapnumb.size()));
		return map.get(mapnumb.get(alea));
		
	}
}
