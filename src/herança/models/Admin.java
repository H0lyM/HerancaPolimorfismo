package herança.models;

import java.util.Arrays;

public class Admin extends Person {
    String cpf;
    String function;
    String[] dependents;

    public Admin(String name, String phone, String adress, String cpf, String function, String[] dependents) {
        super(name, phone, adress);
        this.cpf = cpf;
        this.function = function;
        this.dependents = dependents;
    }

    public String getCpf() {
        return cpf;
    }

    public String getFunction() {
        return function;
    }

    public String[] getDependents() {
        return dependents;
    }

    public void printInfo() {
        showPersonInfo();
        System.out.println("Cpf: " + getCpf());
        System.out.println("Function: " + getFunction());
        System.out.println("Dependents: " + Arrays.toString(getDependents()));
    }
}
