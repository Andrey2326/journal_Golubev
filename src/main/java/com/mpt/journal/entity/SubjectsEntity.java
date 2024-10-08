package com.mpt.journal.entity;

import com.mpt.journal.model.SubjectsModel; // Изменено на SubjectsModel

public class SubjectsEntity extends SubjectsModel { // Изменено на SubjectsEntity

    public SubjectsEntity(int id, String subjectsName) { // Изменено на subjectsName
        super(id, subjectsName); // Изменено на subjectsName
    }
}

