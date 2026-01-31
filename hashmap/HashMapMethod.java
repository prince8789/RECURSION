
import java.util.*;
public class HashMapMethod {
    static void HMmethod(){
        Map<String,Integer> mp = new HashMap<>();
        // Adding element in Hashmap 
        mp.put("Akash",20);
        mp.put("yash",23);
        mp.put("Ayush",15);
        mp.put("prince",24);
        mp.put("Anjali",21);
        
        
        //getiing value of a keyfrom the HashMap
        System.out.println(mp.get("Anjali"));
        System.out.println(mp.get("rahul"));

        // chaking / updating value of a key in Hashmap
        mp.put("Akash",25);
        System.out.println(mp.get("Akash"));

        // removing a pair from the Hashmap
        System.out.println(mp.remove("Akash"));
        System.out.println(mp.remove("Riya"));


        //checking if a key is in the Hashmap
        System.out.println(mp.containsKey("Akash"));
        System.out.println(mp.containsKey("Ayush"));

        // Adding a new entry only if the new key doesn't exists already
        mp.putIfAbsent("Bhavana", 24);
        mp.putIfAbsent("prince", 22);

        //get all keys in the Hashmap
        System.out.println(mp.keySet());

        //get all values in the Hashmap
        System.out.println(mp.values());

        // get all entries in the Hashmap
        System.out.println(mp.entrySet());



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HMmethod();
    }
    
}
