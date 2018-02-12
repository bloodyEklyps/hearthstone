package game;

import java.util.ArrayList;
import java.util.Scanner;

import cards.Card;
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
	}
	
	public void play(int turn){
		pickCard();
		this.mana = (turn >= 10) ? 10 : turn;
		
		/*TODO
		 * LOOP => while turn not finished 
		 **/
		
		
		showHand();
		System.out.println("action");
		getAction();
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
	
	public void getAction() {
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
	}
	
	public void showHand(){
		for(int index=0;index<hand.size();index++){
			System.out.println(index+"-"+hand.get(index));
		}
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
			obs.refresh(null);
		}
	}
}
