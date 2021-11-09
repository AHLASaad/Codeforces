//https://codeforces.com/problemset/problem/510/A
import java.util.Scanner;

public class FoxAndSnake_800 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int oddness=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                for(int j=0;j<m;j++){
                    System.out.print("#");
                }
            }
            else {
                oddness++;
                for(int j=0;j<m;j++){
                    if(oddness%2==1&&j==m-1){
                        System.out.print("#");
                    }
                    else if(oddness%2==0&&j==0){
                        System.out.print("#");
                    }
                    else {
                        System.out.print(".");
                    }
                }
            }
            System.out.println();
        }
    }
}
