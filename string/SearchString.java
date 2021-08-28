package string;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        char c1 = s2.charAt(0);

        System.out.println(cntString(s1, c1));

    }
    public static int cntString(String s1, char c1){
        int cnt = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.toLowerCase().charAt(i) == Character.toLowerCase(c1)){
                cnt++;
            }
        }
        return cnt;
    }
}
