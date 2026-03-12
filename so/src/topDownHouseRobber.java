import java.util.Arrays;

public class topDownHouseRobber {
    public static void main(String[] args) {
        int[]nums={100,1,1,100};
        int n=nums.length;
        int[]dp=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(helper(nums,dp,n-1));

    }
    static int helper(int[]nums,int[]dp,int i){
        if(i<0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int t=nums[i]+helper(nums,dp,i-2);
        int s=helper(nums,dp,i-1);
        dp[i]=Math.max(t,s);
        return dp[i];

    }
}
