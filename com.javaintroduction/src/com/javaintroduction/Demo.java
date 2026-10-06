package com.javaintroduction;

public class Demo {

    static void method1() {
    	method3();
        System.out.println("method one started!");
    }

    void method2() {
        System.out.println("method two started!");
        method4();
    }
    
    static void method3() {
        System.out.println("method three started!");
    }
    
    
    void method4() {
        System.out.println("method four started!");
        
    }

    public static void main(String[] args) {

        Demo os = new Demo();

        System.out.println("main method started !!");

        method1();
        os.method2();

        System.out.println("main method ended !!");
    }
}
