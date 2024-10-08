package com.mpt.journal.repository;

import org.springframework.stereotype.Repository;
import com.mpt.journal.model.InstructorsModel; // Изменено на InstructorsModel

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class InMemoryInstructorsRepository { // Изменено на InMemoryInstructorsRepository
    private List<InstructorsModel> instructors = new ArrayList<>(); // Изменено на InstructorsModel
    private AtomicInteger idCounter = new AtomicInteger(1);

    public InstructorsModel addInstructor(InstructorsModel instructor) { // Изменено на InstructorsModel
        instructor.setId(idCounter.getAndIncrement());
        instructors.add(instructor);
        return instructor;
    }

    public InstructorsModel updateInstructor(InstructorsModel instructor) { // Изменено на InstructorsModel
        for (int i = 0; i < instructors.size(); i++) {
            if (instructors.get(i).getId() == instructor.getId()) {
                instructors.set(i, instructor);
                return instructor;
            }
        }
        return null;
    }

    public void deleteInstructor(int id) {
        instructors.removeIf(instructor -> instructor.getId() == id);
    }

    public List<InstructorsModel> findAllInstructors() { // Изменено на InstructorsModel
        return new ArrayList<>(instructors);
    }

    public InstructorsModel findInstructorById(int id) { // Изменено на InstructorsModel
        return instructors.stream()
                .filter(instructor -> instructor.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
