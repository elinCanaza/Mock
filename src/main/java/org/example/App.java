package org.example;

/**
 * Hello world!
 *
 */
public class App {

    public void message(String message){
        System.out.println("Printing: " + message);
    }
    public static void main( String[] args ) {
        App app = new App();
        app.message("Hello from custom function");
    }
}
