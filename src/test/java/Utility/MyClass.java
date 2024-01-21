package Utility;

public class MyClass {

    public void method1() {
        String myString = "Hello, World!"; // Define the string locally in method1
        method2(myString); // Pass the string to method2
    }

    public void method2(String inputString) {
        // Use the inputString parameter in method2
        System.out.println("Received string: " + inputString);
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        myObject.method1();
    }
}