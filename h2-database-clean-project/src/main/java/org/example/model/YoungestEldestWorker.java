package org.example.model;

public class YoungestEldestWorker {
    private String type;
    private String name;
    private String birthday;

    public YoungestEldestWorker() {}

    public YoungestEldestWorker(String type, String name, String birthday) {
        this.type = type;
        this.name = name;
        this.birthday = birthday;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Worker{type='%s', name='%s', birthday='%s'}".formatted(type, name, birthday);
    }
}
