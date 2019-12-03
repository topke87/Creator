
public class TabelaA implements Comparable<TabelaA> {
	String teamName;
	int played;
	int wins;
	int draws;
	int lose;
	int goalsF;
	int goalsA;
	int goalD;
	int points;
	
	public TabelaA(String teamName, int played, int wins, int draws, int lose, int goalsF, int goalsA, int goalD, int points) {
		super();
		this.teamName = teamName;
		this.played = played;
		this.wins = wins;
		this.draws = draws;
		this.lose = lose;
		this.goalsF = goalsF;
		this.goalsA = goalsA;
		this.goalD = goalD;
		this.points = points;
		
	}
	
	public String getteamName() {
		return teamName;
		
	}
	public void setteamName(String teamName) {
		this.teamName = teamName;
	}
	public int getPlayed() {
		return played;
	}
	public void setPlayed(int played) {
		this.played = played;
	}
	public int getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public int getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	public int getLoses() {
		return lose;
	}
	public void setLoses(int lose) {
		this.lose = lose;
	}
	public int getGF() {
		return goalsF;
	}
	public void setGF(int goalsF) {
		this.goalsF = goalsF;
	}
	public int getGA() {
		return goalsA;
	}
	public void setGA(int goalsA) {
		this.goalsA = goalsA;
	}
	public int getGD() {
		return goalD;
	}
	public void setGD(int goalD) {
		this.goalD = goalD;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
	public int compareTo(TabelaA comparepointsTabelaA) {
		
		
			int comparePoints = ((TabelaA) comparepointsTabelaA).getPoints();
			
			return comparePoints  - this.points;
			
			
		}
	

	
	
	
}

	
