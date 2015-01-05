package org.tutorial.java8;

/**
 * A very basic program that uses a Lambda expression to prove that Java 8 is in use.
 * An earlier version will have compile errors.
 * 
 * @author Carmen Grantham
 *
 */
public class TestJava8 {

    public static void main(String[] args) {
        TestInterface tester = () -> System.out.println("Java 8 is working!");
        tester.test();
    }
}
