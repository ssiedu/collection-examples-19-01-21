
import java.util.Stack;


public class BoxUnBoxExample {

    public static void main(String[] args) {
        Stack stk=new Stack();
        stk.push("abc");        //no boxing required (push needs an object, we are passing string)
        stk.push(10);           //using autoboxing 10=>new Integer(10)
        stk.push(2.5);          //using autoboxing 2.5=> new Double(2.5)
        Double d1=(Double) stk.pop();
        System.out.println(d1*2);           //d1.doubleValue()  (unboxing Double object to premitive double)
        Integer i1=(Integer)stk.pop();      //i1.intValue()     (unboxing Integer object to premitive int) 
        System.out.println(i1+2);
    }
}
