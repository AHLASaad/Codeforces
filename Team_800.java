//Input
//The first input line contains a single integer n (1≤n≤1000) — the number of problems in the contest. Then n lines contain three integers each, each integer is either 0 or 1. If the first number in the line equals 1, then Petya is sure about the problem's solution, otherwise he isn't sure. The second number shows Vasya's view on the solution, the third number shows Tonya's view. The numbers on the lines are separated by spaces.
//
//Output
//Print a single integer — the number of problems the friends will implement on the contest.
//
//Examples
//inputCopy
//3
//1 1 0
//1 1 1
//1 0 0
//outputCopy
//2
//inputCopy
//2
//1 0 0
//0 1 1
//outputCopy
//1
//Note
//In the first sample Petya and Vasya are sure that they know how to solve the first problem and all three of them know how to solve the second problem. That means that they will write solutions for these problems. Only Petya is sure about the solution for the third problem, but that isn't enough, so the friends won't take it.
//
//In the second sample the friends will only implement the second problem, as Vasya and Tonya are sure about the solution.
import java.util.Arrays;
import java.util.Scanner;

public class Team_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 1000 : ");
        int number = scanner.nextInt();
        scanner.nextLine();
        while (number < 1 || number > 1000) {
            System.out.println("Enter a number between 0 and 1000 : ");
            number = scanner.nextInt();
            scanner.nextLine();
        }
        String line ;
        int count = 0;
        int result = 0;
        int[] binaryNumber = new int[3];
        char[] binaryChar = new char[3];
        for (int i = 0; i < number; i++) {
            System.out.println("Enter a Line of 3 numbers 0 or 1 separated by space :");
            line = scanner.nextLine();
            String[] numbers = line.split(" ");
            System.out.println(Arrays.toString(numbers));
            for (int j = 0; j < 3; j++) {
                binaryNumber[j] = Integer.parseInt(numbers[j]);
                if (binaryNumber[j] == 1) {
                    count++;
                }
                System.out.println("count = "+count);
                if (j == 2 && count > 1) {
                    result++;
                    System.out.println("result = "+result);
                }
            }
            count = 0;
        }
        System.out.println("the number of problems the friends will implement on the contest :"+result);
        System.out.println(result);
    }
}
