package com.sip.javaBasics;

public class WrapperClass {

    //mechanism to convert primitive dataTypes to object and object to Primitive dataTypes
    //converting string to integer is a parseInt() method

    public static void main(String[] args) {
        int a = 10;
        Integer i = new Integer(10);

        String s = "500";
        String s1 = "500.40";

        System.out.println(Integer.valueOf(s));
        System.out.println(Integer.parseInt(s));
        System.out.println(Double.valueOf(s1));
        System.out.println(Double.valueOf(a));
        System.out.println(Integer.valueOf(a));

    }
}
