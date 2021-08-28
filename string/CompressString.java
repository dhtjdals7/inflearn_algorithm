package string;


import java.util.Scanner;

public class CompressString {
    public static void main(String[] args){
//        System.out.println((char)50);
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        char ch = str.charAt(0);
        int cnt = 0;

        String answer = "";
        for(int i=0;i <= str.length() ;i++){
            if(i == str.length()){
                if(cnt == 1){
                    answer += str.charAt(i-1);
                }
                else{
                    answer += (str.charAt(i-1));
                    answer += (char)(cnt + 48);
                }
                break;
            }
            if(str.charAt(i) == ch){
                cnt++;
            }else{
                if(cnt == 1){
                    answer += str.charAt(i-1);
                    if(i==str.length() - 1) answer += str.charAt(i);
                }
                else{
                    answer += (str.charAt(i-1));
                    answer += (char)(cnt + 48);
                }
                cnt = 1;
                ch = str.charAt(i);
            }
        }
        System.out.println(answer);

    }
}
