package org.example.model;

public class LongestProject {
    private int id;
    private int monthCount;

    public LongestProject() {}

    public LongestProject(int id, int monthCount) {
        this.id = id;
        this.monthCount = monthCount;
    }

    public int getId() {
        return id;
    }

    public int getMonthCount() {
        return monthCount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMonthCount(int monthCount) {
        this.monthCount = monthCount;
    }

    @Override
    public String toString() {
        return "Project{id=%d, monthCount=%d}".formatted(id, monthCount);
    }
}
