import java.lang.System;
public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("Senior Developer starts architecting and mentoring");
        setSalary(getSalary() + 1500);
    }
}
