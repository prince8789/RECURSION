public class kMultipleOfNum {
    static void mul(int num,int k){
        if(k==1) {
            System.out.print(num+" ");
            return;
        }
        mul(num , k-1);
        System.out.print(num*k+" ");

    }
    public static void main(String[] args) {
        mul(8,5);
    }
    
}
