package number;

import java.util.Scanner;

/*
 * 작성일자 : 2021-10-05
 * 문   제 : 격자판 최대합
 * 문제설명 : N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
 * 입   력 : 첫 줄에 자연수 N이 주어진다.(2<=N<=50)
 *          두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.
 * 예   시 ) Input   5                Output 155
 *                  10 13 10 12 15
 *                  12 39 30 23 11
 *                  11 25 50 53 15
 *                  19 27 29 37 27
 *                  19 13 30 13 19
 * */
public class GridMaximumSum {
    static int[][] board;
    static int MAX_VALUE = Integer.MIN_VALUE;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        board = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = sc.nextInt();
            }
        }

        // 행과 열의 합 계산
        for(int i = 0; i < N; i++){
            int sum1 = 0; // 행의 합
            int sum2 = 0; // 열의 합

            for(int j = 0; j < N; j++){
                sum1 += board[i][j];
                sum2 += board[j][i];
            }

            if(sum1 >= MAX_VALUE) MAX_VALUE = sum1;
            else if(sum2 >= MAX_VALUE) MAX_VALUE = sum2;
        }

        int sum3 = 0; // i==j 인 대각선의 합
        int sum4 = 0; // i + j + 1 == N인 대각선의 합

        // 대각선 합 계산
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i==j){
                    sum3 += board[i][j];
                }
                if(i + j + 1 == N ){
                    sum4 += board[j][i];
                }

            }
        }
        
        if(sum3 >= MAX_VALUE) MAX_VALUE = sum3;
        else if(sum4 >= MAX_VALUE) MAX_VALUE = sum4;

        System.out.println(MAX_VALUE);
    }
}
