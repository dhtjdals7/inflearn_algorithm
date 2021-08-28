package string;

import java.util.Scanner;

/*
*
* @author : 오성민
* 작 성 일 : 2021-08-20
* 문   제 : 숫자만 추출
* 문제설명 :문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
*         만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
*         추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
*
*/
public class OnlyNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = "";

        for(int i=0;i<str.length();i++){
            int ascii = (int)str.charAt(i);
            if(48 <= ascii && ascii <= 57) answer += str.charAt(i);
        }

        System.out.println(Integer.parseInt(answer));
    }
}
