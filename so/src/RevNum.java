public class RevNum {
    public static void main(String[] args) {
        int n=12345;
        rev(n);

    }
    static  void rev(int n){
        if(n<=0){
            return ;
        }
        int rem=n%10;
        System.out.print(rem);
        n=n/10;
        rev(n);
    }


}
