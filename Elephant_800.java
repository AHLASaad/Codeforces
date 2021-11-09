//An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's house is located at point x(x>0) of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 positions forward. Determine, what is the minimum number of steps he need to make in order to get to his friend's house.
//
//Input
//The first line of the input contains an integer x (1≤x≤1000000) — The coordinate of the friend's house.
//
//Output
//Print the minimum number of steps that elephant needs to make to get from point 0 to point x.
//
//Examples
//input
//5
//output
//1
//input
//12
//output
//3
//Note
//In the first sample the elephant needs to make one step of length 5 to reach the point x.
//
//In the second sample the elephant can get to point x if he moves by 3, 5 and 4. There are other ways to get the optimal answer but the elephant cannot reach x in less than three moves.
import java.util.Scanner;

public class Elephant_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter an integer that represent the coordinate of the friend's house : ");
        int number = scanner.nextInt();
        int numberMax = (int) Math.pow(10, 6);
        scanner.nextLine();
        while (number < 1 || number > numberMax) {
//            System.out.println("Enter an integer that represent the coordinate of the friend's house : ");
            number = scanner.nextInt();
            scanner.nextLine();
        }
        int count = number;
        int steps = 0;
        while (count != 0) {
            while (count / 5 != 0) {
                steps += count/5;
                count = count%5;
//                System.out.println("devided by 5");
            }
            while (count / 4 != 0) {
                steps += count/4;
                count = count%4;
//                System.out.println("devided by 4");
            }
            while (count / 3 != 0) {
                steps += count/3;
                count = count%3;
//                System.out.println("devided by 3");
            }
            while (count / 2 != 0) {
                steps += count/2;
                count = count%2;
//                System.out.println("devided by 2");
            }
            if (count == 1) {
                count--;
                steps++;
//                System.out.println("minus 1 ");
            }
        }
//
        System.out.println(steps);
    }
}
