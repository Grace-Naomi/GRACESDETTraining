package com.sip.Strings;

public class ComparingStrings {

    public static void main (String [] args){

        String web="Playwright";// Stored in string pool memory
        String web1="Playwright";

        String webTool=new String("Playwright");// stored in heap memory
        String webTool1=new String("Playwright");

        boolean b=web.equals(webTool);//compares the value
        boolean b1=(web == webTool);//comared the address in memory


        System.out.println(b);
        System.out.println(b1);

        System.out.println("***************************");


        System.out.println(webTool == webTool1);//false address is different
        System.out.println(webTool.equals(webTool1));// true compared the values and it is same


        System.out.println("***************************");

        System.out.println(web==web1);//true compared the values in String Pool Memory

        System.out.println(web.equals(web1));

        System.out.println("*************************");

        System.out.println(web==webTool.intern());//true   intern method compares two string objects

    }
}
