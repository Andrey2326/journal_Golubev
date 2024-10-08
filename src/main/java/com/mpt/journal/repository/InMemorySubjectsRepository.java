package com.mpt.journal.repository;

import com.mpt.journal.model.SubjectsModel; // Изменено на SubjectsModel
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Repository
public class InMemorySubjectsRepository { // Изменено на InMemorySubjectsRepository
    private List<SubjectsModel> subjects = new ArrayList<>(); // Изменено на SubjectsModel
    private AtomicInteger idCounter = new AtomicInteger(1);

    public List<SubjectsModel> findBySubjectsName(String subjectsName) { // Изменено на findBySubjectsName
        return subjects.stream()
                .filter(subject -> subject.getSubjectsName().equalsIgnoreCase(subjectsName) && !subject.isDeleted()) // Изменено на getSubjectsName
                .collect(Collectors.toList());
    }

    public List<SubjectsModel> filterSubjects(String subjectsName, Boolean deleted, Integer id) { // Изменено на filterSubjects
        return subjects.stream()
                .filter(subject -> (subjectsName == null || subject.getSubjectsName().equalsIgnoreCase(subjectsName)) && // Изменено на getSubjectsName
                        (deleted == null || subject.isDeleted() == deleted) &&
                        (id == null || subject.getId() == id))
                .collect(Collectors.toList());
    }

    public void logicalDeleteSubjects(int id) { // Изменено на logicalDeleteSubjects
        subjects.stream()
                .filter(subject -> subject.getId() == id)
                .forEach(subject -> subject.setDeleted(true));
    }

    public void logicalDeleteMultipleSubjects(List<Integer> ids) { // Изменено на logicalDeleteMultipleSubjects
        subjects.stream()
                .filter(subject -> ids.contains(subject.getId()))
                .forEach(subject -> subject.setDeleted(true));
    }

    public void deleteSubjects(int id) { // Изменено на deleteSubjects
        subjects.removeIf(subject -> subject.getId() == id);
    }

    public SubjectsModel addSubjects(SubjectsModel subject) { // Изменено на addSubjects
        subject.setId(idCounter.getAndIncrement());
        subjects.add(subject);
        return subject;
    }

    public SubjectsModel updateSubjects(SubjectsModel subject) { // Изменено на updateSubjects
        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).getId() == subject.getId()) {
                subjects.set(i, subject);
                return subject;
            }
        }
        return null;
    }

    public List<SubjectsModel> findAllSubjects() { // Изменено на findAllSubjects
        return new ArrayList<>(subjects);
    }

    public SubjectsModel findSubjectsById(int id) { // Изменено на findSubjectsById
        return subjects.stream()
                .filter(subject -> subject.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
