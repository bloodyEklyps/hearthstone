package cards;

import game.Const;

public abstract class Card {

	private int manaCost;
	private String name;
	//if it's not a class card => hero = null
	private Const.Heroes hero;
	
	public Card(String name, int manaCost, Const.Heroes hero) {
		super();
		this.manaCost = manaCost;
		this.name = name;
		this.hero = hero;
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

	/**
	 * @return the hero
	 */
	public Const.Heroes getHero() {
		return hero;
	}

	/**
	 * @param hero the hero to set
	 */
	public void setHero(Const.Heroes hero) {
		this.hero = hero;
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
