package org.strawberry.demo1.model;

public class UserInfo {
    private String username;
    private String gender;
    private int age;
    private String address;

    public UserInfo(String username, String gender, int age, String address) {
        this.username = username;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public UserInfo() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
