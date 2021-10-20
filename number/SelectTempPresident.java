package number;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
 * 작성일자 : 2021-10-20
 * 문   제 : 임시반장 정하기
 * 문제설명 : https://cote.inflearn.com/contest/10/problem/02-11 참고
 * 입   력 : 첫째 줄에는 반의 학생 수를 나타내는 정수가 주어진다. 학생 수는 3 이상 1000 이하이다.
 *          둘째 줄부터는 1번 학생부터 차례대로 각 줄마다 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 5개의 정수가 빈칸 하나를 사이에 두고 주어진다.
 *          주어지는 정수는 모두 1 이상 9 이하의 정수이다.
 * 예   시 ) Input 5              Output 4
 *                2 3 1 7 3
 *                4 1 9 6 8
 *                5 5 2 4 4
 *                6 5 2 6 7
 *                8 4 2 2 2
 *
 * */
public class SelectTempPresident {
    static int[][] studentArr;
    static int[] cntArr;
    static boolean[][] visit;
    static int MAX_VALUE = Integer.MIN_VALUE;
    static Queue<Integer> queue = new PriorityQueue<Integer>();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        studentArr = new int[N + 1][6];
        cntArr = new int[N + 1];
        visit = new boolean[N + 1][N + 1];

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= 5; j++){
                studentArr[i][j] = sc.nextInt();
            }
        }

        int cnt = 0;

        // 결과 계산
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= N; j++){
                for(int k = 1; k <= N; k++){
                    if(j==k) continue;

                    if(studentArr[j][i] == studentArr[k][i] && visit[j][k] == false){
                        cntArr[j]++;
                        visit[j][k] = true;
                    }
                }

                if(cntArr[j] >= MAX_VALUE){
                    MAX_VALUE = cntArr[j];
                }
            }

        }

        for(int i = 1; i <= N; i++){
            if(cntArr[i] == MAX_VALUE){
                queue.add(i);
            }
        }

        System.out.println(queue.poll());
    }
}
