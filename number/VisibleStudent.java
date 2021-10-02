package number;

import java.util.Scanner;

/*
 * 문   제 : 보이는 학생
 * 문제설명 : 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
             선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)
 * 작성일자 : 2021-10-02
 * ex) Input 8                                  Output
 *           130 135 148 140 145 150 150 153    5
 *
 * */
public class VisibleStudent {
    static int[] heightArr;
    static int MAX_HEIGHT;
    static int cnt = 1;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        heightArr = new int[N];

        for(int i = 0; i < N; i++){
            heightArr[i] = sc.nextInt();
        }

        MAX_HEIGHT = heightArr[0];
        for(int i = 1; i < N; i++){
            int curHeight = heightArr[i];

            if(curHeight > heightArr[i-1] && curHeight > MAX_HEIGHT){
                cnt++;
                MAX_HEIGHT = curHeight;
            }
        }

        System.out.println(cnt);
    }
}
