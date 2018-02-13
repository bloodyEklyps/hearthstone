package game;

import java.util.ArrayList;
import java.util.Iterator;

import cards.Card;
import cards.minion.common.Minion;
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
		}
	}
	
	public void aoe(int damage){
		for (Minion m : troops){
			m.setCurrentHealth(m.getCurrentHealth()-damage);
		}
	}
		
	public void display(){
		String res=hero.toString()+"\n";
		res+="|---------------------|---------------------|---------------------|---------------------|---------------------|---------------------|---------------------|\n";
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";
		for(Card c:troops) {
			res+="|";
			int nbrspace=(21-c.getName().length())/2;
			for(int i=0;i<nbrspace;i++) {
				res+=" ";
			}
			res+=c.getName();
			for(int i=0;i<=nbrspace;i++) {
				res+=" ";
			}
		}

		res+="|                     |                     |                     |                     |                     |                     |                     |\n";
		for(Minion c:troops) {
			res+="|";
			res+="PV:"+c.getCurrentHealth();
			for(int i=0;i<17;i++) {
				res+=" ";
			}
		}
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";

		for(Minion c:troops) {
			res+="|";
			res+="Damage:"+c.getCurrentHealth();
			for(int i=0;i<13;i++) {
				res+=" ";
			}
		}
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";
		res+="|---------------------|---------------------|---------------------|---------------------|---------------------|---------------------|---------------------|\n";
	System.out.println(res);
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
	public void refresh(Object obj) {
		Iterator<Minion> iteratorTroops=troops.iterator();
		while(iteratorTroops.hasNext()){
			if(iteratorTroops.next().getCurrentHealth()<=0){
				iteratorTroops.remove();
			}
		}
		if(hero.getCurrentHealth() <= 0){
			Game.setFinished(true);
		}
		display();		
	}

}
