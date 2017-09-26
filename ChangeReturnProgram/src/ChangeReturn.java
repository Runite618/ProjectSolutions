import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChangeReturn {
    public static void main(String [] args) {
        int cost = 0, amountPaid = 0;
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
            System.out.println("In terms of fivers, tenners and twenties you shall receive: ");
            int twentyDivider = Math.round(change / 20);
            int twentyRemainder = change % 20;
            int tennerDivider = Math.round(twentyRemainder / 10);
            int tennerRemainder = twentyRemainder % 10;
            int fiverDivider = Math.round(tennerRemainder / 5);
            int fiverRemainder = tennerRemainder % 5;
            if(twentyDivider >= 1) {
                System.out.printf("Twenties: %d%n", twentyDivider);
            }
            if(tennerDivider >= 1) {
                System.out.printf("Tenners: %d%n", tennerDivider);
            }
            if(fiverDivider >= 1) {
                System.out.printf("Fivers: %d%n", fiverDivider);
            }
            if(fiverRemainder >= 1){
                System.out.printf("Pounds: %d%n", fiverRemainder);
            }
        }
        else {
            System.out.println("Error! not enough money given to cover the cost of the item!");
        }
    }
}
