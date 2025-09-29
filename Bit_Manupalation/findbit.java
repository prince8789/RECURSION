import java.util.*;

public class findbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int n = sc.nextInt();
        System.out.println("enter the location of bit");
        int pos = sc.nextInt();
        int mask =1<<pos;
        if((n & mask )==0){
            System.out.println("the give position of bit is 0");
     
        }
        else{
            System.out.println("the given position of bit is 1");
        }
    }
}
