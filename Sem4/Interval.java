/*Given a set of intervals with starting and finishing times, write a JAVA program to find the
maximal set of mutually compatible intervals those can be processed under a single available
resource using Greedy approach.*/

package prog1;
public class Interval {
	    int start;
	    int finish;
	    public Interval(int start, int finish) {
	        this.start = start;
	        this.finish = finish;}
	    @Override
	    public String toString() {
	        return "[" + start + ", " + finish + "]";
	    }
	}
	

