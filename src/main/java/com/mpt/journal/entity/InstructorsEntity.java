package com.mpt.journal.entity;

import com.mpt.journal.model.InstructorsModel; // Обновлено на InstructorsModel

public class InstructorsEntity extends InstructorsModel { // Обновлено на InstructorsEntity

    public InstructorsEntity(int id, String name, String lastName, String firstName, String middleName) { // Обновлено на InstructorsEntity
        super(id, name, lastName, firstName, middleName); // Обновлено на InstructorsModel
    }
}

