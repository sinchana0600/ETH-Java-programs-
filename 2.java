class ReverseNumber {
    public static void main(String[] args) {

        int num = 876;
        int rem;
        int reverse = 0;

        while(num != 0) {
            rem = num % 10;                 // get last digit
            reverse = reverse * 10 + rem;  // form reverse
            num = num / 10;                // remove last digit
        }

        System.out.println("Reversed no: " + reverse);
    }
}
