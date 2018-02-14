package cards.minion.common;

import cards.minion.Minion;

public class YetiNoroit extends Minion {

	private YetiNoroit() {
		super("Yéti noroit", 4, 4, 5);
	}
	
	public static Minion createYetiNoroit(){
		return new YetiNoroit();
	}


}
