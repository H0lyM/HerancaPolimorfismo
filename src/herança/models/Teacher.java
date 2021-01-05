package herança.models;

import java.util.Arrays;

public class Teacher extends Person {
    String cpf;
    String degree;
    String[] dependents;

    public Teacher(String name, String phone, String adress, String cpf, String degree, String[] dependents) {
        super(name, phone, adress);
        this.cpf = cpf;
        this.degree = degree;
        this.dependents = dependents;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDegree() {
        return degree;
    }

    public String[] getDependents() {
        return dependents;
    }

    public void printInfo() {
        showPersonInfo();
        System.out.println("Cpf: " + getCpf());
        System.out.println("Degree: " + getDegree());
        System.out.println("Dependents: " + Arrays.toString(getDependents()));
    }

}
