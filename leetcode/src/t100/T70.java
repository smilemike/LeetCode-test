package t100;

/**
 * 70 爬楼梯
 */
public class T70 {
    public int climbStairs(int n) {

        int[] dp = new int[n+1];

        if(n==1) return 1;
        if(n==2) return 2;
        for(int i=1;i<=n;i++){
            if(i==1){
                dp[1] = 1;
                continue;
            }

            if(i==2){
                dp[2] = 2;
                continue;
            }

            dp[i] = dp[i-1]+dp[i-2];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(new T70().climbStairs(4));
    }
}
