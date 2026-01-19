import java.util.*;
public class checkEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number for check even or odd");
        int n = sc.nextInt();
        int bitmask =1;
        if((n & bitmask) ==0){
            System.out.println("the nuber is even ");

        }
        else{
            System.out.println("the number is odd");
        }
    }
    
}
