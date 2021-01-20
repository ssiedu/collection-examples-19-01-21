
import java.util.Stack;


public class GenStack {

    public static void main(String[] args) {
        
        //we wish to manage a stack of String elements only
        Stack<String> stk1=new Stack<String>();
        stk1.push("aa");
        stk1.push("bb");
        stk1.push("cc");
        
        //we wish to manage a stack of Integer elements only
        Stack<Integer> stk2=new Stack<Integer>();
        stk2.push(10);
        stk2.push(20);
        stk2.push(30);
        
        Stack stk3=new Stack();
        stk3.push("xyz");
        stk3.push(15);
        stk3.push(43.33);
        
        System.out.println(stk1);
        System.out.println(stk2);
        System.out.println(stk3);
    }
}
