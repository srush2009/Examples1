import java.util.List;

public class HackerLandChessTournament {
	public static int getPotentialOfWinner(List<Integer> potential, int k) {
		int n=potential.size();
		int [] potentials=new int [n] ;
		for(int i=0;i<n;i++) {
			potentials[i]=potential.get(i);
		}
		int consecutiveWins=0;
		int currentPotential=potentials[0];
		for(int i=1;i<potentials.length;i++) {
			if(potentials[i]<currentPotential) {
			    consecutiveWins++;
			    if(consecutiveWins>=k) {
			    	return currentPotential;
			    }
		}else {
			currentPotential=potentials[i];
			consecutiveWins=0;
		}
	}
		return currentPotential;
}
}
