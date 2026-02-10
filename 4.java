public class PrimeCheck {

    public static void main(String[] args) {

        int num1 = 19;
        int num2 = 49;

        checkPrime(num1);
        checkPrime(num2);
    }

    static void checkPrime(int num) {

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {   // remainder 0 means divisible
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is NOT a Prime Number");
    }
}
