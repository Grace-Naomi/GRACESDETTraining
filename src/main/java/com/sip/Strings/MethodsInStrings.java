package com.sip.Strings;

public class MethodsInStrings {

    public static void main(String[] args) {
        String value = "500";
        System.out.println(Integer.parseInt(value));//String "500" got converted into integer value(String to Integer)

        String price = "$200";
        System.out.println(price.substring(1));//index starts with 0 so from index 1 got printed

        String price1 = "$3023457758hsdjsdjkhks1247!#@^#*@#*ghgfhfhRDFCHGVJBJGHFDS4564564564564&@0";
        System.out.println(price1.replaceAll("[^0-9]",""));//replacing all numbers
        System.out.println(price1.replaceAll("[^a-z]",""));// all small albhabets
        System.out.println(price1.replaceAll("[^A-Z]",""));// all capital albhabets
        System.out.println(price1.replaceAll("[^A-Za-z]",""));//all capital and small albhabets
        System.out.println(price1.replaceAll("[^A-Za-z0-9]",""));//all capital, small albhabets and numbers
        System.out.println(price1.replaceAll("[A-Za-z0-9]",""));// only special characters

        System.out.println(price1.length());// length of the price1 String

        String message = "Welcome to training program and $10k payment";
        int index1 = message.indexOf("$");
        System.out.println(index1);//index of $

        String subMessage = message.substring(index1);
        System.out.println(subMessage);//string message index starts from $ to end of the string in a SUB STRING
        int index2 = subMessage.indexOf("k") ;
        System.out.println(index2);//SUB MESSAGE=$10k(index 0123 so index of k is 3)


        String actualMessage = subMessage.substring(0, index2);
        System.out.println(actualMessage);// $10  starts from 0,ends at index 2


    }
}
