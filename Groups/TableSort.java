public class TableSort {

	String teamName;
	Integer played;
	Integer wins;
	Integer draws;
	Integer lose;
	Integer goalsF;
	Integer goalsA;
	Integer goalD;
	Integer points;
	

	public TableSort(String teamName, Integer played, int wins, int draws, int lose, int goalsF, int goalsA, int goalD, int points) {
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
	public Integer getPlayed() {
		return played;
	}
	public void setPlayed(int played) {
		this.played = played;
	}
	public Integer getWins() {
		return wins;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public Integer getDraws() {
		return draws;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	public Integer getLoses() {
		return lose;
	}
	public void setLoses(int lose) {
		this.lose = lose;
	}
	public Integer getGF() {
		return goalsF;
	}
	public void setGF(int goalsF) {
		this.goalsF = goalsF;
	}
	public Integer getGA() {
		return goalsA;
	}
	public void setGA(int goalsA) {
		this.goalsA = goalsA;
	}
	public Integer getGD() {
		return goalD;
	}
	public void setGD(int goalD) {
		this.goalD = goalD;
	}
	public Integer getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	
}
