
package t100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DP，回溯
 * DP m*n的网格
 * 从m->n的所有路径
 * 动态规划需要知道状态，状态转移，状态压缩。
 * 只能向右或向下走。
 * 组合，回溯
 * ------------------
 * 动态规划依赖前一个或前多个状态
 * 回溯正向递归；
 * 动规正向迭代；
 * 动规逆向递归；
 */
public class s62 {
    //M 2 N 3 走1+2=3 =》M-N+1,选1.4 选1
    public int uniquePaths(int m, int n) {

        //i=0,dp[0][j]==j-1;
        //j=0,dp[i][0]==i-1
        //i!=0,j!=0, dp[i][j] = dp[i-1][j]+dp[i][j-1]

        if(m==0&&n==0) return 0;
        if(m==0) return n-1;
        if(n==0) return m-1;
        int[][] dp = new int[m][n];
        int i=0;
        int j = 0;
        for(i=0;i<m;i++){
            for(j =0;j<n;j++){
                if(i==0) {
                    dp[0][j] = 1;
                    continue;
                }

                if(j==0){
                    dp[i][0] = 1;
                    continue;
                }

                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }

        return dp[i-1][j-1];
    }

    public static void main(String[] args) {
        System.out.println(new s62().uniquePaths(3,2) );
    }

}
