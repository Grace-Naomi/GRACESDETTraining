package JirTasks;


    public class DuplicateElementsInArray {


        public static void main(String[] args) {

            int[] arr = new int[]{23,12,2,65,2};
            boolean flag=false;

            for(int i=0;i<arr.length;i++){

                for(int j=i+1;j<arr.length;j++){

                    if (arr[i]==arr[j]){

                        System.out.println("Duplicate Element is found in an array " + arr[i] );

                        flag=true;

                    }

                }
            }
            if (flag==false){
                System.out.println("No Duplicate Element found in an array");
            }

    }

}
