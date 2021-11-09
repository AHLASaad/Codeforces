//You've got a 5 × 5 matrix, consisting of 24 zeroes and a single number one. Let's index the matrix rows by numbers from 1 to 5 from top to bottom, let's index the matrix columns by numbers from 1 to 5 from left to right. In one move, you are allowed to apply one of the two following transformations to the matrix:
//
//Swap two neighboring matrix rows, that is, rows with indexes i and i+1 for some integer i (1≤i<5).
//Swap two neighboring matrix columns, that is, columns with indexes j and j+1 for some integer j (1≤j<5).
//You think that a matrix looks beautiful, if the single number one of the matrix is located in its middle (in the cell that is on the intersection of the third row and the third column). Count the minimum number of moves needed to make the matrix beautiful.
//
//Input
//The input consists of five lines, each line contains five integers: the j-th integer in the i-th line of the input represents the element of the matrix that is located on the intersection of the i-th row and the j-th column. It is guaranteed that the matrix consists of 24 zeroes and a single number one.
//
//Output
//Print a single integer — the minimum number of moves needed to make the matrix beautiful.
//
//Examples
//input
//0 0 0 0 0
//0 0 0 0 1
//0 0 0 0 0
//0 0 0 0 0
//0 0 0 0 0
//output
//3
//input
//0 0 0 0 0
//0 0 0 0 0
//0 1 0 0 0
//0 0 0 0 0
//0 0 0 0 0
//output
//1
import java.util.Arrays;
import java.util.Scanner;

public class BeautifulMatrix__800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first line :");
        String line1 = scanner.nextLine();
        System.out.println("Enter the second line :");
        String line2 = scanner.nextLine();
        System.out.println("Enter the third line :");
        String line3 = scanner.nextLine();
        System.out.println("Enter the fourth line :");
        String line4 = scanner.nextLine();
        System.out.println("Enter the fifth line :");
        String line5 = scanner.nextLine();
        String[] line1WithoutSpace = line1.split(" ");
        String[] line2WithoutSpace = line2.split(" ");
        String[] line3WithoutSpace = line3.split(" ");
        String[] line4WithoutSpace = line4.split(" ");
        String[] line5WithoutSpace = line5.split(" ");
        int[] numbersLine1 = new int[5];
        int[] numbersLine2 = new int[5];
        int[] numbersLine3 = new int[5];
        int[] numbersLine4 = new int[5];
        int[] numbersLine5 = new int[5];
        int[] coordinate = new int[2];
        for (int i = 0; i < 5; i++) {
            numbersLine1[i] = Integer.parseInt(line1WithoutSpace[i]);
            numbersLine2[i] = Integer.parseInt(line2WithoutSpace[i]);
            numbersLine3[i] = Integer.parseInt(line3WithoutSpace[i]);
            numbersLine4[i] = Integer.parseInt(line4WithoutSpace[i]);
            numbersLine5[i] = Integer.parseInt(line5WithoutSpace[i]);
            if (numbersLine1[i] == 1) {
                coordinate[0] = 0;
                coordinate[1] = i;
            }
            if (numbersLine2[i] == 1) {
                coordinate[0] = 1;
                coordinate[1] = i;
            }
            if (numbersLine3[i] == 1) {
                coordinate[0] = 2;
                coordinate[1] = i;
            }
            if (numbersLine4[i] == 1) {
                coordinate[0] = 3;
                coordinate[1] = i;
            }
            if (numbersLine5[i] == 1) {
                coordinate[0] = 4;
                coordinate[1] = i;
            }
        }
        System.out.println(Arrays.toString(numbersLine1));
        System.out.println(Arrays.toString(numbersLine2));
        System.out.println(Arrays.toString(numbersLine3));
        System.out.println(Arrays.toString(numbersLine4));
        System.out.println(Arrays.toString(numbersLine5));
        System.out.println("The coordinate of the 1 :"+Arrays.toString(coordinate));
        int count=0;
        while (true) {
            if (coordinate[0] < 2) {
                count++;
                coordinate[0]++;
            }
            if (coordinate[0] == 2) {
                break;
            }
            if (coordinate[0] > 2) {
                count++;
                coordinate[0]--;
            }

        }
        while (true) {
            if (coordinate[1] < 2) {
                count++;
                coordinate[1]++;
            }
            if (coordinate[1] == 2) {
                break;
            }
            if (coordinate[1] > 2) {
                count++;
                coordinate[1]--;
            }
        }
        System.out.println("the minimum number of moves needed to make the matrix beautiful is "+count);

    }
}
