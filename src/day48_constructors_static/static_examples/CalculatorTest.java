package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        //add is a static method , can be called using Classname.staticMethodName
        //static way of calling the method
        Calculator.add(55,22);
        //Calculator.multiply(5*7); not working because the method is not static.
        //multiply is instance method and we are creating an object then calling it
        Calculator calculator = new Calculator();
        calculator.multiply(5,12);

        //static method can also be called by using an object
        calculator.add(10,45); // works with a warning




    }
}
