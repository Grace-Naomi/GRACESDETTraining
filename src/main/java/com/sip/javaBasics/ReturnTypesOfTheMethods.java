package com.sip.javaBasics;

public class ReturnTypesOfTheMethods {

    public static void main(String[] args) {


        ReturnTypesOfTheMethods returnTypesOfTheMethods = new ReturnTypesOfTheMethods();
        returnTypesOfTheMethods.test1();





    System.out.println(returnTypesOfTheMethods.sum());
        System.out.println(returnTypesOfTheMethods.total(2,9));
        System.out.println(returnTypesOfTheMethods.company("SDET Company"));
        System.out.println(returnTypesOfTheMethods.name());
        System.out.println(returnTypesOfTheMethods.totalValue(5,3.4f));



    }
    public int sum(){
        return 10;
    }

    public int total(int a, int b){
        return a+b;
    }

    public String name(){
        return "Java";
    }

    public String company(String comp){
        return comp;
    }

    public double totalValue(int a, float b){
        return a+b;
    }

    public void test1(){

        System.out.println("Test1");


    }
}
