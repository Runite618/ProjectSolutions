import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DecimalToBinary {
    private ArrayList<Integer> intList;
    private Scanner scanner;
    private int remainder;

    public DecimalToBinary() {
        intList = new ArrayList<>();
    }

    public void decimalToBinary(int decimal) {
        while(decimal != 0) {
            remainder = decimal % 2;
            intList.add(remainder);
            decimal = decimal / 2;
        }

        Collections.reverse(intList);
        for(int element : intList) {
            System.out.print(element);
        }
    }

    public void binaryToDecimal(int binary) {
        
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void main(String [] args) {
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        System.out.println("Please type in a number you wish to convert to binary");
        decimalToBinary.setScanner(new Scanner(System.in));
        int decimal = Integer.parseInt(decimalToBinary.getScanner().nextLine());
        decimalToBinary.decimalToBinary(decimal);
    }
}
