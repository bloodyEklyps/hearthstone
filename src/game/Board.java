package game;

import java.util.ArrayList;

import cards.minion.Minion;
import heros.Hero;
import observer.Observer;
import observer.Subject;

public class Board implements Subject{
	
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
		}
	}
	
	public void aoe(int damage){
		for (Minion m : troops){
			m.setCurrentHealth(m.getCurrentHealth()-damage);
		}
	}
		
	public void display(){
		//display an image of the board
		/*TODO*/
		System.out.println("display board");
	}
	
	public void destroy(Minion minion){
		troops.remove(troops.indexOf(minion));
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

	@Override
	public void addObserver(Observer obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Observer obs) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}
}
