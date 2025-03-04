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

FractionalKnapsack.java

package prog1;
import java.util.Arrays;
public class FractionalKnapsack {
	    public static double getMaxProfit(Item[] items, double capacity) {
	        Arrays.sort(items, (a, b) -> Double.compare(b.profitPerWeight, a.profitPerWeight));
	        double totalProfit = 0;
	        double remainingCapacity = capacity;
	        System.out.println("Selected items (or fractions):");
	        for (Item item : items) {
	            if (remainingCapacity >= item.weight) {
	                totalProfit += item.profit;
	                remainingCapacity -= item.weight;
	                System.out.println("Take all of: " + item);
	            } else if (remainingCapacity > 0) {
	                double fraction = remainingCapacity / item.weight;
	                double fractionalProfit = item.profit * fraction;
	                totalProfit += fractionalProfit;
	                System.out.println("Take " + String.format("%.2f", fraction * 100) + 
	                                 "% of: " + item + 
	                                 " (Profit: " + String.format("%.2f", fractionalProfit) + ")");
	                remainingCapacity = 0;}
	            if (remainingCapacity == 0) break;}
	        return totalProfit;}
	    public static void main(String[] args) {
	        Item[] items = {
	            new Item(10, 60),  
	            new Item(20, 100), 
	            new Item(30, 120) };
	        double capacity = 50;
	        System.out.println("Input items:");
	        for (Item item : items) {
	            System.out.println(item);
	        }
	        System.out.println("Knapsack capacity: " + capacity + "\n");
	        double maxProfit = getMaxProfit(items, capacity);
	        System.out.println("\nMaximum profit achievable: " + String.format("%.2f", maxProfit));
	    }
	}


	
