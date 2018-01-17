package cards.minion;

public class YetiNoroit extends Minion {

	private YetiNoroit() {
		super("Yéti noroit", 4, null, 4, 5);
	}
	
	public static Minion createYetiNoroit(){
		return new YetiNoroit();
	}

}
