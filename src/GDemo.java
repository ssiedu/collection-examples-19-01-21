
public class GDemo<T> {

    //this show method is having a parameter of generic type
    public void show(T p) {
        System.out.println(p);
    }

    public static void main(String[] args) {
        GDemo<String> ob1=new GDemo<>();
        ob1.show("indore");
        //ob1.show(10);
        
        GDemo<Integer> ob2=new GDemo<>();
        ob2.show(10);
        //ob2.show("abc");
        
        GDemo ob3=new GDemo();
        ob3.show(5);
        ob3.show("abc");
    }

}
