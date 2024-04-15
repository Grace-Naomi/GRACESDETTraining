package com.sipa.assignment1.inheritance;

public class GrandChildC extends ChildB{

    public static void main(String[] args) {
        GrandChildC grandChildC = new GrandChildC();
        grandChildC.login();
        int c = grandChildC.a;
        grandChildC.testB();
    }
}
