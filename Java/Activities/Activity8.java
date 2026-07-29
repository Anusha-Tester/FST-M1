class CustomException extends Exception{
    private String mes = null;

    public CustomException(String mes){
        this.mes = mes;

    }
    @Override
    public String getMessage(){
        return mes;
    }
}
public class Activity8 {

    public static void exceptionMethod(String s) throws CustomException{
        if(s==null){
            throw new CustomException("This ia a null value");
        }
        else{
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        try {
            Activity8.exceptionMethod("Print to the Console");
            Activity8.exceptionMethod(null);
            Activity8.exceptionMethod("Hey, its me");
        } catch (CustomException e) {
            System.out.println("Catch block: "+e.getMessage());
        }
        
    }
}
