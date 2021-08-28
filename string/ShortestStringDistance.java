package string;

import java.util.Scanner;

/*
*
* @author : 오성민
* 작 성 일 : 2021-08-21
* 문   제 : 가장 짧은 문자거리
* 문제설명 : 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
* ex) teachermode e -> 1 0 1 2 1 0 1 2 2 1 0
 *
*/
public class ShortestStringDistance {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String str = sc.next();
       char ch = sc.next().charAt(0);

        for(int i=0;i<str.length();i++){
            int min = Integer.MAX_VALUE;
            int leftDis = 0, rightDis = 0;

            // 왼쪽으로 검색
            for(int j=i; j>=0; j--){
                if(str.charAt(j) == ch){
                    if(leftDis <= min) min = leftDis;
                    break;
                }
                leftDis++;
            }

            // 오른쪽으로 검색
            for(int j=i; j < str.length(); j++){
                if(str.charAt(j) == ch){
                    if(rightDis <= min) min = rightDis;
                    break;
                }
                rightDis++;
            }

            System.out.print(min + " ");
        }
    }
}
