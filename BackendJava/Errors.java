package BackendJava;

public class Errors {
    public static void main(String[] args) {
        int i = 8;
        int j = 2;
       try {
           System.out.println(i + j);
       }catch (Exception e) {   // Exception error handling
           System.out.println("Second value can not zero" + e);
       }
    }
}
