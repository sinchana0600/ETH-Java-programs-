class NegativeForLoop {
    public static void main(String[] args) {
        int i;

        for(i = 10; i <= 50; i++) {
            System.out.print(-i + " ");
        }
    }
}



class NegativeWhileLoop {
    public static void main(String[] args) {

        int i = 10;   // initialization

        while(i <= 50) {   // condition
            System.out.print(-i + " ");
            i++;           // increment
        }
    }
}
