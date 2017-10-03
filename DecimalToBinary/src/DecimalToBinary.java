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
        System.out.println();
    }

    public void binaryToDecimal(int binary) {
        long result = 0;
        int tmp;
        int count = 0;
        while(binary > 0) {
            tmp = binary % 10;
            if(tmp == 1) {
                result += Math.pow(2, count);
            }
            count += 1;
            binary /= 10;
        }
        System.out.println(result);
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
        System.out.println("Please type in a number you wish to convert to decimal");
        int binary = Integer.parseInt(decimalToBinary.getScanner().nextLine());
        decimalToBinary.binaryToDecimal(binary);
    }
}
