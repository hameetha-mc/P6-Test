package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application
// This is the Comment by Ms. Hameetha

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model); // Create first controller
        Controller2 c2 = new Controller2(model); // Create second controller
        System.out.println("Hello!Sheeba This is from Hameetha PC");
    } // main
  
} // Main
