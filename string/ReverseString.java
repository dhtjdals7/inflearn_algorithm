package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 단어 뒤집기
public class ReverseString {
    static List<String> list = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            String str = sc.next();
            list.add(str);
        }
        for(String s : list){
            String res = "";
            for(int i=s.length() - 1;i >= 0;i--){
                res+=s.charAt(i);
            }
            System.out.println(res);
        }
    }
}
