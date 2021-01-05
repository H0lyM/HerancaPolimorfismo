package Polimorfismo;

import Polimorfismo.models.Calculator;
import Polimorfismo.models.Example5;

public class TestClass {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(0.005f);
        System.out.println(calculator.sum());

        Example5 example5 = new Example5(0.005f);
        System.out.println(example5.sum());
    }
}
