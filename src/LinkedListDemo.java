
import java.util.LinkedList;


public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(new Integer(101));
        list.add(102);
        list.add(103);
        list.addFirst(104);
        list.add(1,105);    //105 will be added on index 1 
        System.out.println(list);
        //list.removeFirst();
        //list.removeLast();
        list.remove(2);
        System.out.println(list);
    }
}
