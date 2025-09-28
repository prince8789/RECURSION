import java.util.*;
public class powOfpandq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of p ");
        int p = sc.nextInt();
        System.out.println("enter the value of q");
        int q = sc.nextInt();
        System.out.println("power of p and q is "+pow(p,q));
    }
    public static int pow(int p, int q){
        if(q==0){
            return 1;
        }
        return pow(p,q-1)*p;
    }
}
