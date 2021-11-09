//https://codeforces.com/problemset/problem/141/A
import java.util.Scanner;

public class AmusingJoke_800 {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        String s = z.nextLine().toLowerCase();
        String n = z.nextLine().toLowerCase();
        String p = z.nextLine().toLowerCase();
        String sn = s+n;
        if(sn.length() == p.length()){
            boolean flag = false;
            for(char aa='a';aa<='z';aa++){
                if(sn.contains(String.valueOf(aa))){
                    sn = sn.replaceAll(String.valueOf(aa), "");
                    int x = sn.length();
                    p = p.replaceAll(String.valueOf(aa), "");
                    int y = p.length();
                    if(x != y){
                        flag = true;
                        break;
                    }
                }
            }
            if(!flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }else{
            System.out.println("NO");
        }
        z.close();
    }
}
