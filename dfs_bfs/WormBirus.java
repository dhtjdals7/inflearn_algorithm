package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WormBirus {
    static int computerCnt; // 컴터 갯수
    static int N; // 연결된 컴터 쌍 갯수
    static boolean[][] map; // 연결된 컴퓨터 체크
    static boolean[][] visit; //방문했는지 체크
    static int cnt = 0;
    static boolean[] checkComputer;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        computerCnt = sc.nextInt();
        N = sc.nextInt();
        map = new boolean[computerCnt + 1][computerCnt + 1];
        visit = new boolean[computerCnt + 1][computerCnt + 1];
        checkComputer = new boolean[computerCnt + 1];
        for(int i=0;i<N;i++){
            int x,y;
            x = sc.nextInt();
            y = sc.nextInt();
            map[x][y] = true;
            map[y][x] = true;
        }

        dfs(1);

        System.out.println(cnt);
    }

    public static void dfs(int x){
        if(x != 1){
            if(!checkComputer[x]) {
                cnt++;
                checkComputer[x] = true;
            }
        }
        for(int i=1;i<=computerCnt;i++){
            if((map[x][i] && map[i][x]) && (visit[x][i] == false && visit[i][x] == false)){
                visit[x][i] = true;
                visit[i][x] = true;
                dfs(i);
            }
        }
    }
}