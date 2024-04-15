package com.sipa.assignment1.inheritance;

public class ChildB extends ParentA{

    public void testB(){
        System.out.println("TestB in child");
    }

    public static void main(String[] args) {
        ChildB childB = new ChildB();
        childB.login();

        int b = childB.a;
        System.out.println("b value ::" + b );
        System.out.println("location :: " + childB.str);

        FirstClass firstClass = new FirstClass();
        firstClass.testA();
        FirstClass.testB();
    }
}
