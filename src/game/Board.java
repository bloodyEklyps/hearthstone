package game;

import java.util.ArrayList;
import java.util.Iterator;

import cards.Card;
import cards.minion.Minion;
import cards.minion.common.ChefDeRaid;
import heros.Hero;
import observer.Observer;

public class Board implements Observer{
	
	private Hero hero;
	ArrayList<Minion> troops;
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
		String res=  "                                                                         "+hero.toString()+"\n";
		res+="|---------------------|---------------------|---------------------|---------------------|---------------------|---------------------|---------------------|\n";
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";
		for(Card c:troops) {
			res+="|";
			int nbrspace=(21-c.getName().length())/2;
			for(int i=0;i<nbrspace;i++) {
				res+=" ";
			}
			res+=c.getName();
			for(int i=0;i<nbrspace;i++) {
				res+=" ";
			}
		}

		res+="|                     |                     |                     |                     |                     |                     |                     |\n";
		for(Minion c:troops) {
			res+="|";
			res+="Dégats:"+c.getDamage();
			for(int i=0;i<13;i++) {
				res+=" ";
			}
		}
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";

		for(Minion c:troops) {
			res+="|";
			res+="Vie:"+c.getCurrentHealth();
			for(int i=0;i<16;i++) {
				res+=" ";
			}
		}
		
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";

		for(Minion c:troops) {
			if(c.isCharge()){
				res+="|";
				res+="Charge";
				for(int i=0;i<15;i++) {
					res+=" ";
				}
			}
		}
		
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";

		for(Minion c:troops) {
			if(c.isTaunt()){
				res+="|";
				res+="Provocation";
				for(int i=0;i<10;i++) {
					res+=" ";
				}
			}
		}
		
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";

		for(Minion c:troops) {
			if(c.isLifesteal()){
				res+="|";
				res+="Vol de vie";
				for(int i=0;i<11;i++) {
					res+=" ";
				}
			}
		}
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";
		res+="|                     |                     |                     |                     |                     |                     |                     |\n";
		res+="|----------0----------|----------1----------|----------2----------|----------3----------|----------4----------|----------5----------|----------6----------|\n";
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
		//obj is always the ennemy board so we can update both boards
		refreshBoard((Board) obj);		
		refreshBoard(this);
	}
	
	public void refreshBoard(Board board){
		Iterator<Minion> iteratorTroops=board.getTroops().iterator();
		while(iteratorTroops.hasNext()){
			Minion minion = iteratorTroops.next();
			if(minion.getCurrentHealth()<=0){
				if (minion instanceof ChefDeRaid){
					for(Minion m : board.getTroops()){
						m.setDamage(m.getDamage()-1);
					}
				}
				iteratorTroops.remove();
			}
		}
		if(board.getHero().getCurrentHealth() <= 0){
			Game.setFinished(true);
		}
		board.display();
	}

}
