package com.mpt.journal.model;

public class InstructorsModel { // Обновлено на InstructorsModel
    private int id;
    private String name;
    private String lastName;
    private String firstName;
    private String middleName;

    public InstructorsModel(int id, String name, String lastName, String firstName, String middleName) { // Обновлено на InstructorsModel
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
