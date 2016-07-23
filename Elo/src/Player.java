/*
 * This class models a 'player' which could be anything, that competes against some other object of the same category
 */
public class Player {

	// Current elo-number
	private int elo;
	
	/*
	 * Construction without number means elo = 1000
	 */
	public Player(){
		this.elo = 1000;
	}
	
	/*
	 * Construction with elo-number
	 */
	public Player(int elo){
		this.elo = elo;
	}

	public int getElo() {
		return elo;
	}

	public void setElo(int elo) {
		this.elo = elo;
	}
	
}
