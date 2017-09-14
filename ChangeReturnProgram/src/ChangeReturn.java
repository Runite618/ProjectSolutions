import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeReturn {
    public static void main(String [] args) {
        int cost = 0, amountPaid = 0;
        int fiver = 5;
        int tenner = 10;
        int twenty = 20;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How much does the item cost?");
        try {
            cost = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("How much do you wish to pay for the item?");
        try {
            amountPaid = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(amountPaid >= cost) {
            int change = amountPaid - cost;
            System.out.printf("The amount of change you shall receive is %d%n", change);
        }
        else {
            System.out.println("Error! not enough money given to cover the cost of the item!");
        }
    }
}
