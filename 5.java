import java.util.Arrays;

public class SquareCheck {

    // Function to calculate distance square
    static int dist(int x1, int y1, int x2, int y2) {
        return (x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1);
    }

    public static void main(String[] args) {

        int[] p1 = {20, 10};
        int[] p2 = {10, 20};
        int[] p3 = {20, 20};
        int[] p4 = {10, 10};

        int[] d = new int[6];

        d[0] = dist(p1[0], p1[1], p2[0], p2[1]);
        d[1] = dist(p1[0], p1[1], p3[0], p3[1]);
        d[2] = dist(p1[0], p1[1], p4[0], p4[1]);
        d[3] = dist(p2[0], p2[1], p3[0], p3[1]);
        d[4] = dist(p2[0], p2[1], p4[0], p4[1]);
        d[5] = dist(p3[0], p3[1], p4[0], p4[1]);

        Arrays.sort(d);

        if (d[0] > 0 &&
            d[0] == d[1] &&
            d[1] == d[2] &&
            d[2] == d[3] &&
            d[4] == d[5]) {

            System.out.println("Yes, it forms a Square");
        } else {
            System.out.println("No, it does not form a Square");
        }
    }
}
