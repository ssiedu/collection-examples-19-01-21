
public class Test {

    public static int[] calculate(int number){
        int square=number*number;
        int cube=square*number;
        int result[]={square,cube};
        return result;
    }
    
    public static void main(String[] args) {
        
        //you wish to pass an int to calculate method and you want method to return its square and cube both.
        int res[]=calculate(3);
        System.out.println("Square : "+res[0]);
        System.out.println("Cube   : "+res[1]);
        
    }
}
