package JiraTasks;

public class ExceptionTryCatch {

    public static void main(String[] args) {

        int b, a = 5;
        try {
            b = a / 0;
            System.out.println(b);
        } catch (ArithmeticException ae){
            ae.printStackTrace();
        }

        System.out.println("Testing");
    }
}
