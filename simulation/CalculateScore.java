package simulation;

import java.util.Scanner;

/*
 * 작성일자 : 2021-10-04
 * 문   제 : 점수계산
 * 문제설명 : 예를 들어, 아래와 같이 10 개의 OX 문제에서 답이 맞은 문제의 경우에는 1로 표시하고, 틀린 경우에는 0으로 표시하였을 때,
 *           점수 계산은 아래 표와 같이 계산되어, 총 점수는 1+1+2+3+1+2=10 점이다.
 *           1 0 1 1 1 0 0 1 1 0
 * 입   력 :  첫째 줄에 문제의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 N개 문제의 채점 결과를 나타내는 0 혹은 1이 빈 칸을 사이에 두고 주어진다.
 * 예   시 ) Input 10                     Output  10
 *                1 0 1 1 1 0 0 1 1 0
 *
 * */
public class CalculateScore {
    static int[] score;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        score = new int[N];

        for(int i = 0; i < N; i++){
            score[i] = sc.nextInt();
        }

        System.out.println(calScore(score));
    }

    static int calScore(int[] score){
        int res = 0;
        int cnt = 0;

        res += score[0];

        for(int i = 1; i < score.length; i++){
            if(score[i] == 1){
                if(score[i - 1] == 1) res += score[i] + ++cnt;
                else{
                    res += score[i];
                    cnt = 0;
                }
            } else continue;

        }

        return res;
    }
}
