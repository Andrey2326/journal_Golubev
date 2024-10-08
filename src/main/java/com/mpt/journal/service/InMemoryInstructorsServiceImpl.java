package com.mpt.journal.service;

import com.mpt.journal.entity.InstructorsEntity; // Изменено на InstructorsEntity
import com.mpt.journal.model.InstructorsModel; // Изменено на InstructorsModel
import com.mpt.journal.repository.InMemoryInstructorsRepository; // Изменено на InMemoryInstructorsRepository
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryInstructorsServiceImpl implements InstructorsService { // Изменено на InstructorsService

    private final InMemoryInstructorsRepository instructorRepository; // Изменено на InMemoryInstructorsRepository

    public InMemoryInstructorsServiceImpl(InMemoryInstructorsRepository instructorRepository) { // Изменено на InMemoryInstructorsRepository
        this.instructorRepository = instructorRepository;
    }

    @Override
    public List<InstructorsModel> findAllInstructors() { // Изменено на InstructorsModel
        return instructorRepository.findAllInstructors();
    }

    @Override
    public InstructorsModel findInstructorById(int id) { // Изменено на InstructorsModel
        return instructorRepository.findInstructorById(id);
    }

    @Override
    public InstructorsModel addInstructor(InstructorsModel instructor) { // Изменено на InstructorsModel
        return instructorRepository.addInstructor(instructor);
    }

    @Override
    public InstructorsModel updateInstructor(InstructorsModel instructor) { // Изменено на InstructorsModel
        return instructorRepository.updateInstructor(instructor);
    }

    @Override
    public void deleteInstructor(int id) { // Изменено на deleteInstructor
        instructorRepository.deleteInstructor(id);
    }
}
