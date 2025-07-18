package SeungJi20.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;


public class BOJ_2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
       int[] dp = new int[N];
       // int answer = 0;

        if(N==1){
            dp[0] = arr[0];
            System.out.println(dp[0]);
            return;
        }

        if(N==2){
            dp[0] = arr[0];
            dp[1] = arr[0]+arr[1];
            System.out.println(dp[1]);
            return;
        }
        else {
            dp[0] = arr[0];
            dp[1] = arr[0]+arr[1];
            dp[2] = Math.max(arr[0]+arr[2], arr[1]+arr[2]);
            for (int i = 3; i < N; i++) {
                dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i]);
            }
            System.out.println(dp[N-1]);
        }


    }
}
