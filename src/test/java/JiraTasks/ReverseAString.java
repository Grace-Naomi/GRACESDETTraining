package JiraTasks;



public class ReverseAString {


        public static void main (String[] args){

            int i;

            String string1="Hello World I Love selenium";
            System.out.println("The  original string to be Reversed is\n"+string1);
            String rev="";
            for( i=string1.length()-1;i>=0;i--){
                rev=rev+string1.charAt(i);
            }
            System.out.println("The REVERSED String is\n"+rev);
        }
}
