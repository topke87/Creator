import java.util.Comparator;

//for sorting tables by points

public class SortByPts implements Comparator <TableSort> {

	@Override
	public int compare(TableSort a, TableSort b) {
		if(a.getPoints() != b.getPoints()) {
			return b.getPoints() - a.getPoints();
		}
		else if(a.getGD() == b.getGD() && a.getPoints() == b.getPoints()) {
			return b.getGF() - a.getGF();
		}
		else if(a.getPoints() == b.getPoints()) {
			return b.getGD() - a.getGD();
		}
		else if(a.getGF() == b.getGF() && a.getGD() == b.getGD() && a.getPoints() == b.getPoints()) {
			return b.getWins() - a.getWins();
		}
		else if(a.getGF() == b.getGF() && a.getGD() == b.getGD() && a.getPoints() == b.getPoints() && a.getWins() == b.getWins()) {
			return a.getGA() - b.getGA();
		}
		
				
		return 0;
	}

	
}
