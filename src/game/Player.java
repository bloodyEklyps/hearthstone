package game;

import java.util.ArrayList;

import cards.Card;
import cards.minion.Minion;
import cards.minion.common.ChefDeRaid;
import cards.spell.Spell;
import game.Const.Action;
import heros.Hero;
import observer.Observer;
import observer.Subject;

public class Player implements Subject{

	private ArrayList<Card> hand;
	private Board board;
	private String name;
	private int mana;
	private ArrayList<Observer> observers;
	
	public Player(String name, Hero hero) {
		super();
		this.hand = new ArrayList<Card>();
		this.board = new Board(hero);
		this.name = name;
		this.mana = 1;
		this.observers = new ArrayList<Observer>();
		addObserver(this.board);
	}
	
	public void play(int turn){
		pickCard();
		this.mana = (turn >= 10) ? 10 : turn;
		
		Const.Action response=Action.ATTACK;
		do{
			notifyObservers();
			if(Game.isFinished()){
				 break;
			}
			showHand();
			System.out.println("Choisissez votre action (mana : "+this.mana+") : ");
			System.out.println("1 - Attaque");
			System.out.println("2 - Jouer une carte ");
			System.out.println("3 - Passer");
			System.out.println("4 - Pouvoir");
			response=getAction();
			if(Action.PLAYCARD==response){
				playCard();
			}else if(Action.ATTACK==response){
				attack();
			}else if(Action.POWER==response) {
				power();
			}
		}while(response!=Const.Action.SKIP || Game.isFinished());
		for(Card c:board.troops) {
			((Minion) c).setStateToAwake();
		}
			
	}
		
	/**
	 * @return the hand
	 */
	public ArrayList<Card> getHand() {
		return hand;
	}

	/**
	 * @param hand the hand to set
	 */
	public void setHand(ArrayList<Card> hand) {
		this.hand = hand;
	}

	/**
	 * @return the board
	 */
	public Board getBoard() {
		return board;
	}

	/**
	 * @param board the board to set
	 */
	public void setBoard(Board board) {
		this.board = board;
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
	 * @return the mana
	 */
	public int getMana() {
		return mana;
	}

	/**
	 * @param mana the mana to set
	 */
	public void setMana(int mana) {
		this.mana = mana;
	}
	
	public void pickCard() {
		hand.add(board.getHero().pickCard());
	}
	
	public void pickManyCard(int nbrCard) {
		for(int i=0;i<3;i++){
			pickCard();
		}
	}
	
	public Const.Action getAction() {
		System.out.println("Quelle action");
		int choice=0;
		do{
			choice=Utils.getInputInt(0,4);
		}while(choice<1||choice>4);
		switch (choice) {
		case 1:
			return Const.Action.ATTACK;
		case 2:
			return Const.Action.PLAYCARD;
		case 3:
			return Const.Action.SKIP;
		case 4:
			return Const.Action.POWER;
		default:
			return null; //error
		}
	}
	
	public void showHand(){
		for(int index=0;index<hand.size();index++){
			System.out.println(index+"-"+hand.get(index));
		}
	}
	
	public boolean playCard(){
		System.out.println("Placer quelle carte?");
		showHand();
		int indexCard=Utils.getInputInt(0,hand.size()-1);
		Card card=hand.get(indexCard);

		if(card.getManaCost()>mana){
			System.out.println("Pas assez de mana");
			return false;
		}else{
			if(card instanceof Spell){
				if(((Spell) card).cast(this)){
					mana-=card.getManaCost();
					hand.remove(indexCard);
					return true;
				}
				else{
					return false;
				}
			}else if(card instanceof Minion){
				Minion minion = ((Minion) card);
				if (minion instanceof ChefDeRaid){
					for(Minion m : getBoard().getTroops()){
						m.setDamage(m.getDamage()+1);
					}
				}
				for(Minion m : getBoard().getTroops()){
					if(m instanceof ChefDeRaid){
						minion.setDamage(minion.getDamage()+1);
					}
				}
				board.troops.add(minion);
				hand.remove(indexCard);
				mana-=card.getManaCost();
				return true;
			}
		}
		return false; //Si ici problème
	}
	
	public boolean attack(){
		if(board.troops.size()>0){
			System.out.println("Quelle carte doit attaquer?");
			board.display();
			int indexCard=Utils.getInputInt(0,board.troops.size()-1);
			Minion card=(Minion) board.troops.get(indexCard);
			System.out.println("quelle carte attaquer?");
			card.attack(Utils.selectTarget(this, Const.Targets.CHARACTERS, Const.Side.ENEMIES));
			if(card.isLifesteal()){
				System.out.println(1);
				getBoard().getHero().setCurrentHealth(getBoard().getHero().getCurrentHealth()+card.getDamage());
			}
			card.setStateToSleep();
		}else{
			System.out.println("Aucune carte pour attaquer!");
		}
		return true; //Si ici problème
	}
	public void power() {
		board.getHero().heroPower(this);
	}

	@Override
	public void addObserver(Observer obs) {
		this.observers.add(obs);
	}

	@Override
	public void removeObserver(Observer obs) {
		this.observers.remove(obs);
	}

	@Override
	public void notifyObservers() {
		for(Observer obs : observers){
			obs.refresh(Game.getEnnemy(this).getBoard());
		}
	}
}
