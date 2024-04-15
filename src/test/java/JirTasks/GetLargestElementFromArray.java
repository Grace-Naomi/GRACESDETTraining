package JirTasks;


public class GetLargestElementFromArray {
    public static void main(String[] args) {

        //Scanner sc=new Scanner(System.in);

        int a[]={50,24,99,32,12};
        // System.out.println("Enter Size of an Array");

        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Largest value of an Array is " + max);

    }
}
