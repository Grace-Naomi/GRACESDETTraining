package com.sip.exceptions;

public class MultipleExceptionsInSameBlock {

    public static void main(String[] args) {

        String s[];
        try {

            int a = 5 / 1;
            try {
                int b = 5 / 0;

            } finally {
                System.out.println("Finally Block");

            }

        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("ArithmeticException Block");



         }
    catch(Throwable aie){
        System.out.println("Throwable catch Block");
         }
        finally{


        System.out.println("Close DB");

             }
        }
    }



