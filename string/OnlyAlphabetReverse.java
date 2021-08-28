package string;

import java.util.Scanner;

// 특정문자 뒤집기(알파벳만 뒤집기)
public class OnlyAlphabetReverse {
    static char[] chArr;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        onlyAlphaReverse(str);
        for(char c : chArr){
            System.out.print(c);
        }

    }

    public static void onlyAlphaReverse(String str){
        chArr = str.toCharArray();
        for(int i=0;i <= ((chArr.length%2==0) ? chArr.length/2 -1: chArr.length/2);i++){
            int ch = chArr[i];
            if((65 <= ch && ch <= 90) || (97 <= ch && ch <= 122)){
                char tmp = chArr[i];
                chArr[i] = chArr[chArr.length - 1 - i];
                chArr[chArr.length - 1 - i] = tmp;
            }else{
                char tmp2 = chArr[chArr.length - 1 - i];
                if((65 <= tmp2 && tmp2 <= 90) || (97 <= tmp2 && tmp2 <= 122)){
                    char tmp3 = chArr[i];
                    chArr[i] = chArr[chArr.length - 1 - i];
                    chArr[chArr.length - 1 - i] = tmp3;
                }
            }
        }
    }
}
