import java.util.Arrays;

public class Nstairs {
    public static void main(String[] args) {
        int n=5;

        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(st(dp,n));


    }
    static int st(int dp[],int n){
        if(n==1||n==2){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int a=st(dp,n-1);
        int b=st(dp,n-2);
        dp[n]=a+b;
        return a+b;
    }

}
