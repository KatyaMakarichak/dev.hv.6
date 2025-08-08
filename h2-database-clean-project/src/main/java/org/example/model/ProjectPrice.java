package org.example.model;

public class ProjectPrice {
    private int projectId;
    private int price;

    public ProjectPrice() {}

    public ProjectPrice(int projectId, int price) {
        this.projectId = projectId;
        this.price = price;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getPrice() {
        return price;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Project{id=%d, price=%d}".formatted(projectId, price);
    }
}
