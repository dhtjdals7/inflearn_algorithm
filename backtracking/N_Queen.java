package backtracking;

import java.util.Scanner;

public class N_Queen {
    static int N;
    static int cnt = 0;
    static int[] dx = {-1,-1,1,1};
    static int[] dy = {-1,1,-1,1};
    static boolean[] colCheck;
    static boolean[][] check;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        
        check = new boolean[N][N];
        colCheck = new boolean[N];

        for(int i=0;i<N;i++){
            nQueen(0,i);
        }
        System.out.println(cnt);
    }

    public static void nQueen(int row, int col){
        colCheck[col] = true;
        check[row][col] = true;
        if(row == N-1){
            cnt++;
        }

        for(int i =0;i<N;i++){
            if(isPossible(row+1,col,i)){
                nQueen(row+1,i);
            }
        }
        colCheck[col] = false;
        check[row][col] = false;
    }

    public static boolean isPossible(int row, int col, int newCol){

        int tmpDx, tmpDy;
        if(col == newCol || colCheck[newCol] == true) return false;
        for(int i=0;i<4;i++){
            tmpDx = 0;
            tmpDy = 0;
            for(int j=0;j<N-1;j++){
                tmpDx += dx[i];
                tmpDy += dy[i];
                if((row + tmpDx > -1 && row + tmpDx <N) && (newCol + tmpDy > -1 && newCol + tmpDy < N)){
                    if(check[row+tmpDx][newCol+tmpDy]) return false;
                }
            }
        }
        return true;
    }
}
