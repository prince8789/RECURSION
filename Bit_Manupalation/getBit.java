import java.util.*;
public class getBit {
    public static int getbit(int n ,int i){
        int bitmask =1<<i;
        if((n & bitmask)==0){
            return 0;

        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number whose bit is check");
        int n = sc.nextInt();
        System.out.println("enter the number of bit");
        int i = sc.nextInt();
        System.out.println(getbit(n, i));
    }
    
}
