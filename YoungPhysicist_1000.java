//https://codeforces.com/problemset/problem/69/A
import java.util.Scanner;

public class YoungPhysicist_1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an positive integer :");
        int integer = scanner.nextInt();
        scanner.nextLine();
        while (integer < 1 || integer > 100) {
//            System.out.println("Enter an positive integer :");
            integer = scanner.nextInt();
            scanner.nextLine();
        }
        int[][] matrixForce = new int[integer][3];
        for (int i = 0; i < integer; i++) {
            for (int j = 0; j < 3; j++) {
                matrixForce[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
        int counter = 0;
        boolean isEquilibrium = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < integer; j++) {
                counter += matrixForce[j][i];
                if (j == integer - 1 && counter != 0) {
                    isEquilibrium = false;
                    break;
                }
            }
        }
        if (isEquilibrium) {
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
