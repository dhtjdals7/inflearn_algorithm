package sequence;

import java.util.Scanner;

/*
 * 작성일자 : 2021-10-03
 * 문   제 : 피보나치 수열
 * 문제설명 : 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 *           2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * 입   력 :  첫 줄에 총 항수 N(3<=N<=45)이 입력된다.
 * 예   시 ) Input 10     Output  1 1 2 3 5 8 13 21 34 55
 *
 * */
public class Fibonacci {
    static int[] fibArr;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        fibArr = new int[N];

        fibArr[0] = 1;
        fibArr[1] = 1;

        for(int i = 2 ; i < N; i++){
            fibArr[i] = fibArr[i - 1] + fibArr[i - 2];
        }

        for(int i = 0; i < N; i++){
            System.out.print(fibArr[i] + " ");
        }
    }
}
