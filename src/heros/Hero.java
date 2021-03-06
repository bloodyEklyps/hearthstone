package heros;

import cards.Card;
import cards.CardFactory;
import game.Const;
import game.Player;
import game.Targetable;

public abstract class Hero implements Targetable{

	private int armor;
	private int currentHealth;
	private int healthMax;
	private Const.Heroes name;
	private CardFactory cardFactory;
	
	public Hero(Const.Heroes name, CardFactory cardFactory) {
		super();
		this.name = name;
		this.armor = 0;
		this.currentHealth = 30;
		this.healthMax = 30;
		this.cardFactory = cardFactory;
	}

	public abstract void heroPower(Player caster);

	public String toString(){
		return name+" "+currentHealth+"+"+armor+"";
	}
	
	
	/**
	 * @return the armor
	 */
	public int getArmor() {
		return armor;
	}

	/**
	 * @param armor the armor to set
	 */
	public void setArmor(int armor) {
		this.armor = armor;
	}

	/**
	 * @return the currentHealth
	 */
	public int getCurrentHealth() {
		return currentHealth;
	}

	/**
	 * @param currentHealth the currentHealth to set
	 */
	public void setCurrentHealth(int currentHealth) {
		if(currentHealth>healthMax){
			this.currentHealth=healthMax;
		}
		else{
			this.currentHealth = currentHealth;
		}
	}

	/**
	 * @return the healthMax
	 */
	public int getHealthMax() {
		return healthMax;
	}

	/**
	 * @param healthMax the healthMax to set
	 */
	public void setHealthMax(int healthMax) {
		this.healthMax = healthMax;
	}

	/**
	 * @return the name
	 */
	public Const.Heroes getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(Const.Heroes name) {
		this.name = name;
	}
	
	public Card pickCard(){
		return this.cardFactory.getRandomCard();
	}
	
	@Override
	public void takeDammage(int dammage) {
		if(this.getArmor()>dammage){
			this.armor-=dammage;
		}else{
			this.currentHealth-=dammage-this.armor;
			this.armor=0;
		}
		
	}
	
	
}
