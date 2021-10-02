package simulation;

import java.util.Scanner;

/*
 * 문   제 : 가위바위보
 * 문제설명 : A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다.
 *          비길 경우에는 D를 출력합니다. 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
 * 작성일자 : 2021-10-02
 * ex) Input 5             Output A
 *           2 3 3 1 3            B
 *           1 1 2 2 3            A
 *                                B
 *                                D
 * */
public class RockPaperScissors {
    static int[] aArr;
    static int[] bArr;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        aArr = new int[N];
        bArr = new int[N];

        // A의 가위바위보 배열
        for(int i = 0; i < N; i++){
            aArr[i] = sc.nextInt();
        }

        // B의 가위바위보 배열
        for(int i = 0; i < N; i++){
            bArr[i] = sc.nextInt();
        }

        // 가위바위보 시작
        for(int i = 0; i < N; i++){
            if(aArr[i] == bArr[i]){
                System.out.println("D");
                continue;
            }

            switch (aArr[i]){
                case 1 :
                    if(bArr[i]  == 2) System.out.println("B");
                    else System.out.println("A");
                    break;
                case 2 :
                    if(bArr[i]  == 1) System.out.println("A");
                    else System.out.println("B");
                    break;
                case 3 :
                    if(bArr[i]  == 1) System.out.println("B");
                    else System.out.println("A");
                    break;
            }
        }
    }
}
