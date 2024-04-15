package com.sip.javaBasics.AboutAccessModifiers;

public class AboutAccessModifiers1 {

    public static void main(String[] args){

        AboutAccessModifiers aboutAccessModifiers=new AboutAccessModifiers();
        aboutAccessModifiers.test4();//void

        //AboutAccessModifiers aboutAccessModifiers3=new AboutAccessModifiers();
       // aboutAccessModifiers3.test3(); //not able to as it is a private method


        AboutAccessModifiers aboutAccessModifiers2=new AboutAccessModifiers();
        aboutAccessModifiers2.test2();//protected

        AboutAccessModifiers aboutAccessModifiers1=new AboutAccessModifiers();
        aboutAccessModifiers1.test1();// public


    }
}
