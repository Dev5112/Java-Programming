/*Given a set of intervals with starting and finishing times, write a JAVA program to find the
maximal set of mutually compatible intervals those can be processed under a single available
resource using Greedy approach.*/

Interval.java
	
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

MaxCompatibleIntervals.java
	
package prog1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class MaxCompatibleIntervals {
    public static List<Interval> findMaxCompatibleIntervals(Interval[] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a.finish, b.finish));
        List<Interval> result = new ArrayList<>();
        if (intervals.length == 0) {
            return result;
        }
        result.add(intervals[0]);
        int lastFinish = intervals[0].finish;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= lastFinish) {
                result.add(intervals[i]);
                lastFinish = intervals[i].finish;}}
        return result;}
    public static void main(String[] args) {
        
        Interval[] intervals = {
            new Interval(1, 4),
            new Interval(2, 5),
            new Interval(7, 9),
            new Interval(6, 8),
            new Interval(4, 7)
        };
        System.out.println("Input intervals:");
        for (Interval interval : intervals) {
            System.out.print(interval + " ");
        }
        System.out.println("\n");
        List<Interval> result = findMaxCompatibleIntervals(intervals);
        System.out.println("Maximum compatible intervals:");
        for (Interval interval : result) {
            System.out.print(interval + " ");
	}}}	

