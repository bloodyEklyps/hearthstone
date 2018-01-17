package game;

public class Game {

	/*static because we want to access that from everywhere,
	 * plus we don't want more than 1 instance of Game */
	private static Player player1 = null;
	private static Player player2 = null;
	private int turn;
	
	public Game(Player player1, Player player2) {
		super();
		Game.player1 = player1;
		Game.player2 = player2;
		this.turn = 0;
	}

	public static Player getEnnemy(Player p){
		if(player1 == null || player2 == null){
			/*TODO throw exception*/
			return null;
		}else {
			if(p.equals(player1)){
				return player2;
			} else {
				return player1;
			}
		}
	}
	
	public void play(int turn){
		/*TODO*/
	}
	
	/**
	 * @return the player1
	 */
	public static Player getPlayer1() {
		return player1;
	}

	/**
	 * @param player1 the player1 to set
	 */
	public static void setPlayer1(Player player1) {
		Game.player1 = player1;
	}

	/**
	 * @return the player2
	 */
	public static Player getPlayer2() {
		return player2;
	}

	/**
	 * @param player2 the player2 to set
	 */
	public static void setPlayer2(Player player2) {
		Game.player2 = player2;
	}

	/**
	 * @return the turn
	 */
	public int getTurn() {
		return turn;
	}

	/**
	 * @param turn the turn to set
	 */
	public void setTurn(int turn) {
		this.turn = turn;
	}

	
	
}
