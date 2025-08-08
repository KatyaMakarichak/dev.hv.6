package org.example.model;

public class MaxSalaryWorker {
    private String name;
    private int salary;

    public MaxSalaryWorker() {}

    public MaxSalaryWorker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{name='%s', salary=%d}".formatted(name, salary);
    }
}
