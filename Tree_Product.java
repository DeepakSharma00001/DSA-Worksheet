import java.util.Scanner;

public class Tree_Product {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int H = scanner.nextInt();
            if (H == 0) {
                break;
            }

            int numNodes = (1 << H) - 1; 
            long[] values = new long[numNodes];
            for (int i = 0; i < numNodes; i++) {
                values[i] = scanner.nextLong();
            }
            long P1 = calculateP1(values, 0); 
            System.out.println(P1);
        }
    }
    private static long calculateP1(long[] values, int i) {
        if (i >= values.length) {
            return 1; 
        }

        long leftChild = calculateP1(values, 2 * i + 1);
        long rightChild = calculateP1(values, 2 * i + 2);
        long Pi = Math.max(values[i] * leftChild, values[i] * rightChild);
        return Pi % 1_000_000_007;
    }
}
