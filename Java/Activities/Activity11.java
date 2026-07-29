import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "One");
        hm.put(2, "two");
        hm.put(3, "three");
        hm.put(4, "four");
        hm.put(5, "five");

        System.out.println("Hashmap: "+hm);

        hm.remove(3);

        System.out.println("After removing three: "+ hm);

        if(hm.containsValue("five")){
            System.out.println("five exists in the hashmap");
        }
        else{
            System.out.println("five doesn't exists in the hashmap");
        }

        System.out.println("Number of pairs in the map is: "+ hm.size());
    }
}
