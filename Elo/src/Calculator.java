
public class Calculator {

	public static void main(String[] args){
		Player p1 = new Player(2806);
		Player p2 = new Player(2577);
		
		for (int i = 0; i <= 1000; i++){
			match(p1,p2,10,Math.random()*100);
		}
		
	}
	
	/**
	 * Match between two players with a factor
	 * @param p1 Player1
	 * @param p2 Player2
	 * @param factor Modifier for the importance of that match
	 * @param points1 100 = win, 50 = tie, 0 = loss, points2 is 100-points1
	 */
	public static void match(Player p1, Player p2, double factor, double points1){
		// beginning
		System.out.println("Match: Coefficient: " + factor + ", p1-points: " + points1);
		System.out.println("ALT: Alfred: " + p1.getElo() + ", Berta: " + p2.getElo());

		double elo1 = p1.getElo();
		double elo2 = p2.getElo();
		double exp1 = Math.round((1/(1 + Math.pow(10, (elo2-elo1)/400)))*1000)/1000.0;
		double exp2 = Math.round((1 - exp1)*1000)/1000.0;
		double elo_new1 = elo1 + factor*(points1/100 - exp1);
		double elo_new2 = elo2 + factor*((100-points1)/100 - exp2);
		p1.setElo((int) Math.round(elo_new1));
		p2.setElo((int) Math.round(elo_new2));
		
		// end
		System.out.println("NEU: Alfred: " + p1.getElo() + ", Berta: " + p2.getElo());
	}
	
	/*
	 * Match between two players
	 * If no modifier is given, we take standard factor = 10
	 */
	public static void match(Player p1, Player p2){
		
	}
	
}
