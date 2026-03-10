public class sumRec {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        int temp=sum(n-1)+n;
        return temp;
    }
}
