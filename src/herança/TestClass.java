package herança;

import herança.models.Admin;
import herança.models.Person;
import herança.models.Student;
import herança.models.Teacher;

public class TestClass {

    public static void main(String[] args) {
        Student student = new Student("Murilo", "(00) 4002-8922",
                "Rua Mojin das Cruzes, nº 666", "08/05/1999", "Juarez");
        student.printInfo();
        System.out.println("*****************");

        Person cleber = new Person("Cleber", "3421-7070", "Rua abc da Silva, nº 2");
        student.changePerson(cleber);
        student.printInfo();
        System.out.println("*****************");

        Teacher teacher = new Teacher("Olirum", "(00) 1122-3344",
                "Rua Cruzes Credos, nº 123", "123.456.789-10", "Medicine",
                new String[]{"Cleber", "Cleiton", "Cleunilce"});
        teacher.printInfo();
        System.out.println("*****************");

        Admin admin = new Admin("Khadgar", "(00) 1967-7789",
                "Rua Dow, nº 48", "987.654.321-01", "Mailman",
                new String[]{"Cleber", "Cleiton", "Cleunilce"});
        admin.printInfo();
    }
}
