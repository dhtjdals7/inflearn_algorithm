package number;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 작성일자 : 2021-10-03
 * 문   제 : 뒤집은 소수
 * 문제설명 : N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
 *          예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
 * 입   력 : 첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다. 각 자연수의 크기는 100,000를 넘지 않는다.
 * 예   시 ) Input 9                                  Output 23 2 73 2 3
                  32 55 62 20 250 370 200 30 100
 *
 * */
public class FlippedPrimeNumber {
    static List<Integer> numList = new ArrayList<>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            String str = sc.next();
            StringBuilder sb = new StringBuilder();

            for(int j = str.length() - 1; j >= 0 ; j--){
                sb.append(str.charAt(j));
            }

            numList.add(Integer.parseInt(sb.toString()));
        }

        for(int res : numList){
            if(isPrime(res)) System.out.print(res + " ");
        }
    }

    static boolean isPrime(int N){
        int cnt = 0;

        for(int i = 2; i <= N; i++){
            if(N % i == 0) cnt++;
        }

        if(cnt == 1) return true;
        return false;
    }
}
