package Zoo;

import Helpers.colorHelper;

public class Employee {
    public String name;
    public EmployeeGender gender;
    public int age;

    public Employee(String name, EmployeeGender gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

        System.out.println(colorHelper.textYellow(name+ " s'occupe desormais de votre zoo !"));
    }
}
