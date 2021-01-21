
import java.util.ArrayList;
import java.util.Collections;


public class CollThree {

    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();
        cities.add("delhi"); cities.add("bhopal"); cities.add("mumbai"); cities.add("agra"); cities.add("chennai");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println("After Sorting....");
        for(String city : cities){
            System.out.println(city);
        }
        
        
    }
}
