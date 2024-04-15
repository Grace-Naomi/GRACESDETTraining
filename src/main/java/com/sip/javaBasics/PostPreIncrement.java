package com.sip.javaBasics;

public class PostPreIncrement {

    public static void main(String[] args){

        int a =10;
        int b =5;

        a++;//10+1=11
        System.out.println(a);//11
        System.out.println(a++);//11
        System.out.println(a);//11+1=12


        ++a;//1+12=13
        System.out.println(a);//13
        System.out.println(++a);//1+13=14
        System.out.println(a);//14
        System.out.println(a++);// 14
        System.out.println(a);


        b--;//5-1=4
        System.out.println(b);//4
        System.out.println(b--);//4-1 but b is 4 before decrement
        System.out.println(b);//3

       // b=3
        --b;//1-3=2
        System.out.println(b);//2
        System.out.println(--b);
        System.out.println(b);
        System.out.println(b--);
        System.out.println(b);
        System.out.println(--b);

    }

}
