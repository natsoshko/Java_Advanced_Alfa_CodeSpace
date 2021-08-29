package com.alfabank.work4;

public class Runner {
    public void run() {
        System.out.println("\n--- Main class ---");
        MyTestClass test = new MyTestClass();
        test.test();

        System.out.println("--- Static Nested class ---");
        MyTestClass.MyStaticNested nest = new MyTestClass.MyStaticNested();
        nest.getStr3();
        nest.callFromStaticNested();


        System.out.println("--- Inner class ---");
        MyTestClass.MyInner inn = test.new MyInner();
        inn.getStr2();
        inn.callFromInner();

        System.out.println("--- local class ---");
        test.localMethod();
    }
}
