public class ErrorsNExceptions{
    public static void main(String[] args) {
        int a=5, b=0, c;
        // System.out.println("Try block will run");
        try {
            c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e.toString()); //Method 1
            // e.getMessage();      //Method 2
            // e.printStackTrace(); //Method 3
            // System.out.println("Catch block successfully executed");
        }

      }
