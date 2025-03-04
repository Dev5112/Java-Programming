/*Given n items with their weights and profits and a knapsack of capacity W, write a JAVA
program to select the subset of items into the knapsack to maximize the profit of the selection
and not exceeding the capacity of the knapsack. We can select a fraction of an item in order to
maximize the total profit of the selected items.*/

Item.java

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

	
