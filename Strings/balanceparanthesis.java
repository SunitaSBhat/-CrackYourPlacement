import java.util.*;
class balanceparanthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
           if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
            st.push(s.charAt(i));
           } 
           else if(st.size()==0){
            return false;
           }
           else if(st.size()!=0 && s.charAt(i)==')' && st.peek()=='('){
             st.pop();
           }
            else if(st.size()!=0 && s.charAt(i)=='}' && st.peek()=='{'){
             st.pop();
           }
            else if(st.size()!=0 && s.charAt(i)==']' && st.peek()=='['){
             st.pop();
           }
           else{
            st.push(s.charAt(i));
           }
           }
        if(st.size()!=0){
            System.out.println("why");
            return false;
        }
        return true;
    }
}