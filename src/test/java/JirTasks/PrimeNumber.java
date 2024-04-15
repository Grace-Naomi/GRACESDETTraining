package JirTasks;

import org.testng.annotations.Test;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        int count=0;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int number=scanner.nextInt();

        if(number>1)
        {
            for(int i=1;i<=number;i++)
            {
                if(number % i==0)
                    count++;
            }

            if(count==2)
            {
                System.out.println("It is a Prime Number");
            }
            else
            {
                System.out.println("It is not a Prime Number");
            }

        }





    }
}
