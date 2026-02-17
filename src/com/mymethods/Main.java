/**
 *   Java program to demonstrate method overloading.
 */

package com.mymethods;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Calling static methods of Main.
        Main.method(5, 8);
        Main.method("Hello", "World");
        
    }

    // Method with 2 numeric arguments.
    public static void method(int number, int number1) {

        System.out.println("Method with numeric arguments");

    }

    // Method with 2 string arguments.
    public static void method(String line, String line1) {

        System.out.println("Method with string arguments");

    }

}