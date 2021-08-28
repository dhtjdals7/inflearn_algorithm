package if_for;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
* 문   제 : 큰 수 출력하기
* 문제설명 : N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요. (첫 번째 수는 무조건 출력한다)
* 작성일자 : 2021-08-29
* ex) input : 6(1 <= N <= 100)   ->  output : 7 9 6 12
*             7 3 9 5 6 12
* */
public class PrintBiggestNumber {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < list.size(); i++){
            if(i == 0)  res.append(list.get(i));
            else{
                int cur = list.get(i), before = list.get(i - 1);
                if(cur > before){
                    res.append(" ");
                    res.append(cur);
                }
            }
        }
        System.out.println(res);
    }
}
