package com.mpt.journal.service;

import com.mpt.journal.model.SubjectsModel; // Заменено на SubjectsModel
import java.util.List;

public interface SubjectsService { // Заменено на SubjectsService
    public List<SubjectsModel> findAllSubjects(); // Заменено на SubjectsModel
    public SubjectsModel findSubjectsById(int id); // Заменено на SubjectsModel
    public SubjectsModel addSubjects(SubjectsModel subject); // Заменено на SubjectsModel
    public SubjectsModel updateSubjects(SubjectsModel subject); // Заменено на SubjectsModel
    public void deleteSubjects(int id); // Заменено на SubjectsModel
    void logicalDeleteSubjects(int id); // Заменено на SubjectsModel
    List<SubjectsModel> findBySubjectsName(String subjectsName); // Заменено на SubjectsModel
    List<SubjectsModel> filterSubjects(String subjectsName, Boolean deleted, Integer id); // Заменено на SubjectsModel
    void logicalDeleteMultipleSubjects(List<Integer> ids); // Заменено на SubjectsModel
}

