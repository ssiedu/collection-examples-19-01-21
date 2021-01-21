
import java.util.TreeMap;


public class MapDemo {

    public static void main(String[] args) {
        TreeMap<String,Integer> marks=new TreeMap<>();
        //HashMap<String,Integer> marks=new HashMap<>();
        //LinkedHashMap<String,Integer> marks=new LinkedHashMap<>();
        marks.put("Amit", 90);
        marks.put("Rajeev",80);
        marks.put("Prakash",95);
        marks.put("Riya",95);
        
        System.out.println(marks);
        //System.out.println(marks.get("Prakash"));
        
        
        /*
        HashMap<String,String> cities=new HashMap<>();
        cities.put("mycity", "indore");     //key->mycity, value->indore
        cities.put("capital","bhopal");
        cities.put("filmcity","mumbai");
        //System.out.println(cities);
        String s=cities.get("dreamcity");
        System.out.println(s);
        */
    }
}
