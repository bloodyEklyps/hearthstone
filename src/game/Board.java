package game;

import java.util.ArrayList;

import cards.minion.Minion;
import heros.Hero;

public class Board {
	
	private Hero hero;
	ArrayList<Minion> troops;
	private final static int BOARDMAXSIZE = 7;
	
	public Board(Hero hero) {
		super();
		this.hero = hero;
		this.troops = new ArrayList<Minion>();
	}
	
	public void summon(Minion minion){
		if(troops.size() < BOARDMAXSIZE){
			troops.add(minion);
		}
	}
	
	public void aoe(int damage){
		for (Minion m : troops){
			m.setCurrentHealth(m.getCurrentHealth()-damage);
		}
	}
	
	public void destroy(Minion minion){
		troops.remove(troops.indexOf(minion));
	}
	
	public void fullClear(){
		troops.clear();
	}
	
	/**
	 * @return the hero
	 */
	public Hero getHero() {
		return hero;
	}
	/**
	 * @param hero the hero to set
	 */
	public void setHero(Hero hero) {
		this.hero = hero;
	}
	/**
	 * @return the troops
	 */
	public ArrayList<Minion> getTroops() {
		return troops;
	}
	/**
	 * @param troops the troops to set
	 */
	public void setTroops(ArrayList<Minion> troops) {
		this.troops = troops;
	}
	
	public String toString(){
		return this.troops.toString();
	}
	
	
	
}
