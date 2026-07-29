import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add("4");
        hs.add("5");
        hs.add("6");

        System.out.println("Print the size of the hashset: "+hs.size());

        System.out.println("Removing the 4th element here!"+hs.remove("4"));

        System.out.println("Trying to remove an element which is not present in the set!"+hs.remove("7"));

        System.out.println("Checking if the 8 is in the set or not: "+hs.contains("8"));

        for (String str : hs) {
            System.out.println(str);
            
        }
    }
}
