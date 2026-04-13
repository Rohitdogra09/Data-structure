import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("India", 120);
        map.put("US", 60);
        map.put("China", 130);
        System.out.println(map);

//        if(map.containsKey("China")){
//            System.out.println("China present");
//        }else System.out.println("Not present");

        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

    }
}
