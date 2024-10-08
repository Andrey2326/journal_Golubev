package com.mpt.journal.service;

import com.mpt.journal.model.InstructorsModel; // Изменено на InstructorsModel

import java.util.List;

public interface InstructorsService { // Изменено на InstructorsService
    List<InstructorsModel> findAllInstructors(); // Изменено на InstructorsModel
    InstructorsModel findInstructorById(int id); // Изменено на InstructorsModel
    InstructorsModel addInstructor(InstructorsModel instructor); // Изменено на InstructorsModel
    InstructorsModel updateInstructor(InstructorsModel instructor); // Изменено на InstructorsModel
    void deleteInstructor(int id); // Изменено на deleteInstructor
}
