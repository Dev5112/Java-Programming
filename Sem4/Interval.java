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
	

