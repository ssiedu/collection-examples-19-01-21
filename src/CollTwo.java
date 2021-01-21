
import java.util.Arrays;


public class CollTwo {

    public static void main(String[] args) {

        int n[]={100,15,150,25,34,2,1,85,90};
        for(int tmp:n){
            System.out.println(tmp);
        }
        System.out.println("AFTER-SORTING.....");
        Arrays.sort(n);
        for(int tmp:n){
            System.out.println(tmp);
        }
        
        int idx=Arrays.binarySearch(n, 25);
        System.out.println("Index of 25 : "+idx);
    }
}
