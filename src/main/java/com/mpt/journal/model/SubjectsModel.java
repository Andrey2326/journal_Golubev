package com.mpt.journal.model;

public class SubjectsModel { // Изменено на SubjectsModel
    private int id;
    private String subjectsName; // Изменено на subjectsName
    private boolean deleted;

    public SubjectsModel(int id, String subjectsName) { // Изменено на SubjectsModel
        this.id = id;
        this.subjectsName = subjectsName; // Изменено на subjectsName
        this.deleted = false;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSubjectsName() { return subjectsName; } // Изменено на getSubjectsName
    public void setSubjectsName(String subjectsName) { this.subjectsName = subjectsName; } // Изменено на setSubjectsName

    public boolean isDeleted() { return deleted; }
    public void setDeleted(boolean deleted) { this.deleted = deleted; }
}

