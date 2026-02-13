package payment;
import java.util.Scanner;

interface PaymentMethod {
    void pay(int amount);
}

class UpiPayment implements PaymentMethod {
    
    public void pay(int amount) {
        System.out.println("Amount " + amount + " deposited using UPI");
    }
}

class DebitCardPayment implements PaymentMethod {
   
    public void pay(int amount) {
        System.out.println("Amount " + amount + " deposited using Debit Card");
    }
}

class CashPayment implements PaymentMethod {
    public void pay(int amount) {
        System.out.println("Amount " + amount + " deposited using Cash");
    }
}

class payment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaymentMethod p;

        System.out.println("Choose Payment Method:");
        System.out.println("1. UPI");
        System.out.println("2. Debit Card");
        System.out.println("3. Cash");

        int choice = sc.nextInt();

        System.out.println("Enter amount to deposit:");
        int amount = sc.nextInt();

        if (choice == 1) {
            p = new UpiPayment();
        } else if (choice == 2) {
            p = new DebitCardPayment();
        } else if (choice == 3) {
            p = new CashPayment();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        p.pay(amount);
    }
}

