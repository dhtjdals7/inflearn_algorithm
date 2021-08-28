package string;

import java.util.Scanner;

public class Code {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        String str = sc.next();
        String chgStr = "";


        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == '#') chgStr += "1";
            else if(ch == '*') chgStr += "0";
            else break;
        }
        String answer = "";
        for(int i = 0; i < cnt ; i++){
            int len = chgStr.length()/cnt;
            int pow = 64, res = 0;
            for(int j = len * i; j <  len * (i + 1); j++){
                char ch = chgStr.charAt(j);
                if(chgStr.charAt(j) == '1') {
                    res += (pow *= (ch - 48));
                }
                pow /= 2;
            }
            System.out.print((char)res);
        }


    }
}
