//Input
//The first (and the only) input line contains integer number w (1≤w≤100) — the weight of the watermelon bought by the boys.
//
//Output
//Print YES, if the boys can divide the watermelon into two parts, each of them weighing even number of kilos; and NO in the opposite case.
import java.util.Scanner;

public class Watermelon_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a weight between 1 and 100 :");
        int weight = scanner.nextInt();
        scanner.nextLine();
        while (weight > 100 || weight < 1) {
            System.out.println("Enter a weight between 1 and 100 :");
            weight = scanner.nextInt();
            scanner.nextLine();
        }
        if (weight != 2 && weight % 2 == 0) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
