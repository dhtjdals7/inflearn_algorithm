package simulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 작성일자 : 2021-10-04
 * 문   제 : 등수구하기
 * 문제설명 : N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
 *          같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
 *          즉, 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.
 * 입   력 : 첫 줄에 N(3<=N<=100)이 입력되고, 두 번째 줄에 국어점수를 의미하는 N개의 정수가 입력된다.
 * 예   시 ) Input 5                  Output 4 3 2 1 5
 *                87 89 92 100 76
 *
 * */
public class CalculateRanking {
    static List<Score> scoreList = new ArrayList<>();
    static List<Score> tmpList = new ArrayList<>();
    static int ranking = 1;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 0; i < N; i++ ){
            scoreList.add(new Score(i + 1, sc.nextInt()));
        }

        tmpList.addAll(scoreList);

        // 내림차순 정렬
        Collections.sort(tmpList);

        Score firstScore = tmpList.get(0);
        firstScore.rank = ranking;

        int cnt = 1;

        for(int i = 1; i < tmpList.size(); i++) {
            Score curScore = tmpList.get(i);
            Score beforeScore = tmpList.get(i -1);

            if(curScore.score == beforeScore.score){
                curScore.rank = ranking;
                cnt++;
            }
            else{
                ranking += cnt;
                curScore.rank = ranking;
                cnt = 1;
            }
        }

        for(Score s1 : scoreList){
            for(Score s2 : tmpList){
                if(s1.score == s2.score){
                    System.out.print(s1.rank + " ");
                    break;
                }
            }
        }
    }

    static class Score implements Comparable<Score>{
        int rank;
        int score;

        public Score(int rank, int score){
            this.rank = rank;
            this.score = score;
        }

        public int compareTo(Score s){
            if(this.score < s.score) return 1;
            else return -1;
        }

        public String toString(){
            return "rank = " + this.rank + ", score = " + this.score;
        }
    }
}
