import java.util.Arrays;

public class UniquePath {
    public static void main(String[] args) {
        int m=5;
        int n=5;
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(helper(m-1,n-1,dp));

    }
    static int helper(int m,int n,int[][]dp){
        if(m==0||n==0){
            return 1;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int r=helper(m-1,n,dp);
        int d=helper(m,n-1,dp);
        dp[m][n]=r+d;
        return r+d;
    }

}
