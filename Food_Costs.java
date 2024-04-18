import java.util.Scanner;

public class Food_Costs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int weeklyCost = 6 * X + 1 * Y;
        System.out.println(weeklyCost);
        scanner.close();
    }
}
