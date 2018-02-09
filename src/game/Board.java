package game;

import java.util.ArrayList;

import cards.minion.Minion;
import heros.Hero;
import observer.Observer;

public class Board implements Observer{
	
	private Hero hero;
	ArrayList<Minion> troops;
	//private Subject minion; //do i rly need this?
	private final int BOARDMAXSIZE = 7;
	
	public Board(Hero hero) {
		super();
		this.hero = hero;
		this.troops = new ArrayList<Minion>();
	}
	
	public void summon(Minion minion){
		if(troops.size() < BOARDMAXSIZE){
			troops.add(minion);
			minion.addObserver(this);
		}
	}
	
	public void aoe(int damage){
		for (Minion m : troops){
			m.setCurrentHealth(m.getCurrentHealth()-damage);
		}
	}
	
	@Override
	public void refresh(Object obj) {
		Minion minion = ((Minion) obj);
		if(troops.contains(minion)){
			int index = troops.indexOf(minion);
			if(minion.getCurrentHealth() <= 0){
				troops.remove(index);
			}
			troops.set(index, minion);
		}
		display();//display an updated image of the board
		/*TODO*/
	}
	
	public void display(){
		//display an image of the board
		/*TODO*/
		System.out.println("display board");
	}
	
	public void destroy(Minion minion){
		troops.remove(troops.indexOf(minion));
		minion.removeObserver(this);
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
}
