package string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
* 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
* 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
* ex) ksekkset -> kset
* */
public class RemoveDuplCharacter {
    static boolean[] chFLag = new boolean[200];
    static Queue<Character> queue = new LinkedList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i=0;i<str.length();i++){
            if(!chFLag[(int)str.charAt(i)]) queue.add(str.charAt(i));
            chFLag[(int)str.charAt(i)] = true;
        }

        for(char c : queue){
            System.out.print(c);
        }
    }
}
