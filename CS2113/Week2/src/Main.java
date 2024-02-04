import java.util.Arrays;
import java.util.Scanner;
public class Main {

    // You can add more methods here
    public static void findCost(String in){

        String[] words = in.split(" ");
        String[] costs = new String[words.length];
        int count = 0;
        for (String word: words){
            if (word.startsWith("$")){
                costs[count] = word;
                count++;
            }
        }

        String[] costList = Arrays.copyOf(costs, count);

        System.out.print("Expenses in overseas currency:");
        System.out.println(Arrays.toString(costList));

        double totalCost = 0;
        for (String cost : costList){
            String finalPrice = cost.replace("$", "");
            double price = Double.parseDouble(finalPrice);
            totalCost += price * 1.7;
        }
        System.out.print("Total in local currency: $");
        System.out.println(String.format("%.2f", totalCost));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //get input
        String line = in.nextLine();
        System.out.print("Your expenses while overseas?");

        findCost(line);

    }
}