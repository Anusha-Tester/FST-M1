
interface Addition {
    int add(int a, int b);
    
}

public class Activity12 {
    public static void main(String[] args) {
        Addition ad1 = (a, b) -> (a+b);
        System.out.println(ad1.add(10,20));

        Addition ad2 = (int a, int b) ->{
            return (a+b);
        };

        System.out.println(ad2.add(20, 30));
    }
}
