// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.ArrayList;
import java.util.List;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class EightNeighbours
{        
	// METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
	public List<Integer> cellCompete(int[] states, int days)
	{
		// WRITE YOUR CODE HERE
			int nextDayState[] = new int[states.length];
			for (int i = 0; i < days; i++){
				nextDayState = new int[8];
				for (int j = 0; j < 8; j++){
					switch(j) {
					case 0: {
						if (states[j+1] == 0) nextDayState[j] = 0;
						else nextDayState[j] = 1;
					}
					break;
					case 7 :{	
						if (states[j-1] == 0) nextDayState[j] = 0;
						else nextDayState[j] = 1;
					}
					break;
					default:{
						if ((states[j-1] == 0 && states[j+1] == 0) || (states[j-1] == 1 && states[j+1] == 1)) nextDayState[j] = 0;
						else nextDayState[j] = 1;
					}
					}
				}
				states = nextDayState;
			}
			List<Integer> nextDayStates = new ArrayList<Integer>();
			for(int nextState: nextDayState) {
				nextDayStates.add((Integer)nextState);
			}
			return nextDayStates;
	}
	// METHOD SIGNATURE ENDS
}