package cards;

import game.Const;

public abstract class Card {

	private int manaCost;
	private String name;
	//if it's not a class card => hero = null
	
	public Card(String name, int manaCost) {
		super();
		this.manaCost = manaCost;
		this.name = name;
	}

	/**
	 * @return the manaCost
	 */
	public int getManaCost() {
		return manaCost;
	}

	/**
	 * @param manaCost the manaCost to set
	 */
	public void setManaCost(int manaCost) {
		this.manaCost = manaCost;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	
	@Override
	public String toString() {
		
		return "|-----------|\n"+
			   "|    "+name+"       |\n"+
			   "|           |\n"+
			   "|           |\n"+
			   "|           |\n"+
			   "|     "+manaCost+"      |\n"+
			   "|-----------|\\n";
	}
	
	
	

}
