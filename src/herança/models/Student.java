package herança.models;

import java.util.UUID;

public class Student extends Person {
    private String id;
    private String birthdayDate;
    private String guardian;

    public Student(String name, String phone, String adress, String birthdayDate, String guardian) {
        super(name, phone, adress);
        this.id = UUID.randomUUID().toString();
        this.birthdayDate = birthdayDate;
        this.guardian = guardian;
    }

    public String getId() {
        return id;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public String getParent() {
        return guardian;
    }



    public void printInfo() {
        showPersonInfo();
        System.out.println("Id: " + getId());
        System.out.println("Birthday: " + getBirthdayDate());
        System.out.println("Parent: " + getParent());
    }
}
