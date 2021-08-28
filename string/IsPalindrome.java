package string;

import java.util.Scanner;

/*
* 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
* 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
* ex)
* */
public class IsPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int startIdx = 0, endIdx = str.length() - 1;
        boolean flag = true;

        while(endIdx > startIdx){
            if(Character.isAlphabetic(str.charAt(startIdx)) && Character.isAlphabetic(str.charAt(endIdx))){
                if(str.toUpperCase().charAt(startIdx) != str.toUpperCase().charAt(endIdx)){
                    System.out.println(str.toUpperCase().charAt(startIdx));
                    flag = false;
                }
            }
            startIdx++;
            endIdx--;
        }

        if(!flag) System.out.println("NO");
        else System.out.println("YES");

    }
}
