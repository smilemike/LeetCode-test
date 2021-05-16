package t100;

/**
 * 最小路径和
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 *
 * 思想:
 *  动态规划, dp数组和状态转移.
 */
public class T64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        if (m==0) return 0;
        int n = grid[m-1].length;
        if (n==0) return 0;

        int[][] dp = new int[m][n];
        int i=0;
        int j = 0;

        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                if(i==0&&j==0){
                    dp[i][j]= grid[0][0];
                    continue;
                }

                if (i==0&&j>0){
                    dp[0][j] = dp[0][j-1]+ grid[0][j];
                    continue;
                }

                if (j==0&&i>0){
                    dp[i][0] = dp[i-1][0]+ grid[i][0];
                    continue;
                }
                dp[i][j]= Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[i-1][j-1];
    }

    public static void main(String[] args) {
        int[][] A=new  int[][]{{1,2},{4,5},{7,8,10,11,12},{}};
        System.out.println(A.length);//4,表示数组的行数
        System.out.println(A[0].length);//2，表示对应行的长度
        System.out.println(A[1].length);//2
        System.out.println(A[2].length);//5
        System.out.println(A[3].length);//0
    }
}
