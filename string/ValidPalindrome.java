package string;

import java.util.Scanner;

/*
*
* @author   : 오성민
* 작 성 일   : 2021-08-20
* 문   제   : 유효한 팰린드롬
* 문제설명 : 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
* 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
* 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
*
*/
public class ValidPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int startIdx = 0, endIdx = str.length() - 1;

        boolean flag = true;

        while(endIdx > startIdx){
            if(Character.isAlphabetic(str.charAt(startIdx)) && Character.isAlphabetic(str.charAt(endIdx))){
                if(str.toUpperCase().charAt(startIdx) != str.toUpperCase().charAt(endIdx)){
                    flag = false;
                    break;
                }else{
                    startIdx++;
                    endIdx--;
                    continue;
                }
            }else{
                if(!Character.isAlphabetic(str.charAt(startIdx))){
                    startIdx++;
                    continue;
                }else if(!Character.isAlphabetic(str.charAt(endIdx))){
                    endIdx--;
                    continue;
                }
            }
        }

        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
