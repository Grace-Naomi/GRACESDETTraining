package com.sip.javaBasics;

public class HelloWorld {
    int a = 10;
    String str = "Java";
    char chr = 'S';
    boolean b = true;
    public static float f = 9.6f;


public static void main (String[] args){
    HelloWorld helloWorld= new HelloWorld();
    helloWorld.firstFunction();
    secondFunction();
}
public void firstFunction(){

    System.out.println("\nFirst Function or method got executed");
}
public static void secondFunction(){
    System.out.println("\nSecond Function or method got executed");
}

}
