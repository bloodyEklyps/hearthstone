package game;

import java.util.ArrayList;

import cards.Card;
import heros.Hero;

public class Player {

	private ArrayList<Card> hand;
	private Board board;
	private String name;
	private int mana;
	private int currentMana;
	
	public Player(String name, Hero hero) {
		super();
		this.hand = new ArrayList<Card>();
		this.board = new Board(hero);
		this.name = name;
		this.mana = 1;
		this.currentMana = 1;
	}
	
	public void play(int turn){
		draw();
		this.currentMana = this.mana;
		
		/*TODO*/
		
		this.mana++;
	}
	
	//draw random card
	public void draw(){
		/*TODO*/
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

	/**
	 * @return the currentMana
	 */
	public int getCurrentMana() {
		return currentMana;
	}

	/**
	 * @param currentMana the currentMana to set
	 */
	public void setCurrentMana(int currentMana) {
		this.currentMana = currentMana;
	}
}
