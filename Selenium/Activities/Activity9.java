import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("Ruby");
        list.add("JavaScript");

        System.out.println("Printing all the elements");
        for (String ele : list) {
            System.out.println(ele);
        }

        System.out.println("Printing the 3rd element in the array list: "+list.get(2));
        System.out.println("Checking if C++ is in the list: "+list.contains("C++"));
        System.out.println("The number of names in the list is: "+list.size());

        list.remove("C#");

        System.out.println("Printing the new size of the list: "+list.size());
    }
}
