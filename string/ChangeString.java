package string;

import java.util.Scanner;

// 대소문자 변환(Character.isUpperCase() 써서 대문자면 toLowerCase() 요런식으로 짜도 됨)
public class ChangeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = changeString(str);
        for(char c : ch){
            System.out.print(c);
        }
    }
    public static char[] changeString(String str){
        char[] chArr = str.toCharArray();
        for(int i = 0; i< chArr.length;i++){
            if(chArr[i] < 97 && chArr[i] >= 65){
                chArr[i] = (char)(chArr[i] + 32);
            }else if(chArr[i] >= 97){
                chArr[i] = (char)(chArr[i] - 32);
            }
        }
        return chArr;
    }
}
