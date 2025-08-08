package org.example.model;

public class MaxProjectCountClient {
    private String name;
    private int projectCount;

    public MaxProjectCountClient() {}

    public MaxProjectCountClient(String name, int projectCount) {
        this.name = name;
        this.projectCount = projectCount;
    }

    public String getName() {
        return name;
    }

    public int getProjectCount() {
        return projectCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }

    @Override
    public String toString() {
        return "Client{name='%s', projectCount=%d}".formatted(name, projectCount);
    }
}
