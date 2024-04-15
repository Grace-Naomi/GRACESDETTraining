package com.sip.javaBasics;

public class StaticAndNonStaticMethods {


    public int a = 10;
    public static int sum = 100;
    public void test1(){
        System.out.println("test1 is a non static method");
    }

    public static void test2(){
        System.out.println("Test2 is static method");
    }
    public static void main(String[] args){

        System.out.println("sum is "+sum);

        StaticAndNonStaticMethods differentTypesOfMethods=new StaticAndNonStaticMethods();
        differentTypesOfMethods.test1();
        test2();


        int b=differentTypesOfMethods.a;
        System.out.println(b);
        HelloWorld.secondFunction();//secondFunction is a public static method consisting of static variable
        System.out.println(HelloWorld.f);



}

}