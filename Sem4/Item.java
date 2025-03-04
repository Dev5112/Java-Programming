package prog1;
import java.util.*;
public class Item {
	    double weight;
	    double profit;
	    double profitPerWeight; 
	    public Item(double weight, double profit) {
	        this.weight = weight;
	        this.profit = profit;
	        this.profitPerWeight = profit / weight;}
	    @Override
	    public String toString() {
	        return "Weight: " + weight + ", Profit: " + profit + 
	               ", P/W: " + String.format("%.2f", profitPerWeight);
	    }
	}

	
