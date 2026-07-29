public class Activity2 {
    public static boolean Add(int[] Array, int Num, int Sum){
        int addedvalue = 0;
        for(int i=0; i<=5 ; i++){
            if (Array[i]==Num){
                addedvalue += Array[i];
            }
        }
        if (addedvalue == Sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] Number = {10, 77, 10, 54, -11, 10};
        int Num = 10;
        int Sum = 30;

        System.out.println("The result is: "+ Add(Number, Num, Sum));
        
    }
    
    
}
