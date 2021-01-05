package Polimorfismo.models;

public class Example5 extends Calculator {
    public Example5(float value) {
        super(value);
    }

    public float mult() {
        return value * 5;
    }

    public float div() {
        return value / 5;
    }

    public float sub() {
        return value - 5;
    }

    public float sum() {
        return value + 5;
    }
}
