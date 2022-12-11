import java.util.*;
public class stack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st.peek() + " " + st.size());
        st.push(10);
    }
}