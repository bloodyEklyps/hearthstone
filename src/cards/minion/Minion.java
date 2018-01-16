package cards.minion;

import cards.Card;
import game.Const;
import game.Targetable;
import state.MinionSleepState;
import state.MinionState;

public abstract class Minion extends Card implements Targetable{

	private int damage;
	private int currentHealth;
	private int healthMax;
	private MinionState state;

	
	public Minion(String name, int manaCost, Const.Heroes hero, int damage, int healthMax) {
		super(name, manaCost, hero);
		this.damage = damage;
		this.currentHealth = healthMax;
		this.healthMax = healthMax;
		this.state = new MinionSleepState(this);
	}
	
	public Minion(Minion m) {
		super(m.getName(), m.getManaCost(), m.getHero());
		this.damage = m.getDamage();
		this.currentHealth = m.getCurrentHealth();
		this.healthMax = m.getHealthMax();
		this.state = m.getState();
	}
	
	public void summon(){}
	public void die(){}
	
	public void attack(Targetable target){
		state.attack();
	}
	
	public String toString(){
		return state.toString();
	}

	/**
	 * @return the damage
	 */
	public int getDamage() {
		return damage;
	}

	/**
	 * @param damage the damage to set
	 */
	public void setDamage(int damage) {
		this.damage = damage;
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
		this.currentHealth = currentHealth;
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
	 * @return the state
	 */
	public MinionState getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(MinionState state) {
		this.state = state;
	}
	

}
