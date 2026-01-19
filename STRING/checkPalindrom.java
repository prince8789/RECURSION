import java.util.*;
public class checkPalindrom {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string for check palindrome or not");
        String input = sc.nextLine();
        StringBuilder str = new StringBuilder(input);
        String str2 = str.toString();
        str.reverse(); 
        if(str2.equals(str.toString())){
            System.out.println("the given string is palindrome ");
        }
        else System.out.println("the given string is not pelindrome");

    
    
    }
}

