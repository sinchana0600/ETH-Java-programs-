package operators;
import java.util.Scanner;
public class electricbill {
 public static void main(String[] args) {   
Scanner sc = new Scanner(System.in);
 System.out.print("Enter units: ");
        int units = sc.nextInt();

        int bill;

        bill = (units <= 100) 
                ? units * 5 
                : (units <= 200) 
                    ? (100 * 5 + (units - 100) * 7) 
                    : (100 * 5 + 100 * 7 + (units - 200) * 10);

        System.out.println("Electricity Bill = Rs " + bill);
    }
}
