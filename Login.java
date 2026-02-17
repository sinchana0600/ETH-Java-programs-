package secure;

import java.util.Scanner;

public class loginsystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username;
        int password;

        int attempts = 1;

        while (attempts <= 3) {

            System.out.print("Enter username: ");
            username = sc.next();

            System.out.print("Enter password: ");
            password = sc.nextInt();

            if (username.equals("admin") && password == 1234) {
                System.out.println("Login Successful!");
                break;
            }
            else {
                System.out.println("Wrong login!");

                if (attempts == 3) {
                    System.out.println("Account blocked!");
                }

                attempts = attempts + 1;
            }
        }
    }
}
