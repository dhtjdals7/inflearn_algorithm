package number;

import java.util.Scanner;

/*
 * 작성일자 : 2021-10-03
 * 문   제 : 소수(에라토스테네스 체)
 * 문제설명 : 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
 *          만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.
 * 입   력 : 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.
 * 예   시 ) Input 20     Output 8
 *
 * */
public class PrimeNumber {
    static int res = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 2; i <= N; i++){
            if(cntPrimeNum(i)) res++;
        }

        System.out.println(res);
    }

    static boolean cntPrimeNum(int N){
        int cnt = 0;

        for(int i = 1; i <= Math.sqrt(N); i++){
            if(N % i == 0) cnt++;
        }

        if(cnt == 1) return true;
        return false;
    }
}
