
import java.util.Stack;


public class StackDemo {

    public static void main(String[] args) {

        Stack stk=new Stack();
        
        
        
        stk.push(101);
        stk.push(102);
        stk.push(103);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
    }
}
