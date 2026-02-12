import java.util.*;
public class hashsetoperation {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("prince");
        st.add("rahul");
        st.add("anjali");
        System.out.println(st);
        System.out.println(st.contains("prince"));
        System.out.println(st.contains("bhavna"));
        System.out.println(st.size());
        st.remove("prince");
        System.out.println(st.size());
        System.out.println(st.contains("prince"));
        st.add("prince");
        st.add("op");
        st.add("shivam");
        st.add("bhavana");
        st.add("bhavana");
        for(String s : st){
            System.out.println(s);
        }
    }
    
}
