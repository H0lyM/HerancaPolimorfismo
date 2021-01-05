package herança.models;

public class Person {
    private String name;
    private String phone;
    private String adress;

    public Person(String name, String phone, String adress) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setPhone(String phone) {
        this.phone = phone;
    }

    protected void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public void changePerson(Person person) {
        setName(person.getName());
        setPhone(person.getPhone());
        setAdress(person.getAdress());
    }

    protected void showPersonInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Phone: " + getPhone());
        System.out.println("Adress: " + getAdress());
    }
}
