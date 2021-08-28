package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

// 문장 속 가장 긴 단어 찾기(여러개일 경우 맨 앞 단어 출력)
public class LongestWordFromSentence {
    static int max = Integer.MIN_VALUE;
    static List<String> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        StringTokenizer st = new StringTokenizer(sentence," ");

        while(st.hasMoreTokens()){
            String str = st.nextToken();
            int length = str.length();
            list.add(str);
            if(length >= max){
                max = length;
            }
        }

        for(String s : list){
            if(s.length() == max){
                System.out.println(s);
                break;
            }
        }

    }


}
