package com.sipa.assignment1.abstraction;



    public class TestExecution extends TestAbstract {

        public static void main(String[] args) {

            // rightside parent :: leftside child
            TestAbstract testAbstract = new TestAbstract();
            testAbstract.test1();

            new TestAbstract().test2();

            // rightside grand-parent :: leftside child
            TestClass abtestClass = new TestExecution();
            abtestClass.test1(); //

        }
    }

