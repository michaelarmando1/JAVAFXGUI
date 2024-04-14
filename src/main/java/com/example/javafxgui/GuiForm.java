package com.example.javafxgui;

public class GuiForm {
    private String fName;

    private String lName;

    private String Age;

    private String Course;

    private String Gender;

    public GuiForm(String fName, String lName, String age, String course, String gender) {
        this.fName = fName;
        this.lName = lName;
        Age = age;
        Course = course;
        Gender = gender;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getAge() {
        return Age;
    }

    public String getCourse() {
        return Course;
    }

    public String getGender() {
        return Gender;
    }
}




