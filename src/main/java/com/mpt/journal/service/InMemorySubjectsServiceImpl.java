package com.mpt.journal.service;

import com.mpt.journal.entity.SubjectsEntity; // Заменено на SubjectsEntity
import com.mpt.journal.model.SubjectsModel; // Заменено на SubjectsModel
import com.mpt.journal.repository.InMemorySubjectsRepository; // Заменено на InMemorySubjectsRepository
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemorySubjectsServiceImpl implements SubjectsService { // Заменено на SubjectsService

    private final InMemorySubjectsRepository subjectsRepository; // Заменено на subjectsRepository

    public InMemorySubjectsServiceImpl(InMemorySubjectsRepository subjectsRepository) { // Заменено на SubjectsService
        this.subjectsRepository = subjectsRepository;
    }

    @Override
    public List<SubjectsModel> findAllSubjects() { // Заменено на SubjectsModel
        return subjectsRepository.findAllSubjects(); // Заменено на subjectsRepository
    }

    @Override
    public SubjectsModel findSubjectsById(int id) { // Заменено на SubjectsModel
        return subjectsRepository.findSubjectsById(id); // Заменено на subjectsRepository
    }

    @Override
    public SubjectsModel addSubjects(SubjectsModel subject) { // Заменено на SubjectsModel
        return subjectsRepository.addSubjects(subject); // Заменено на subjectsRepository
    }

    @Override
    public SubjectsModel updateSubjects(SubjectsModel subject) { // Заменено на SubjectsModel
        return subjectsRepository.updateSubjects(subject); // Заменено на subjectsRepository
    }

    @Override
    public void deleteSubjects(int id) { // Заменено на SubjectsModel
        subjectsRepository.deleteSubjects(id); // Заменено на subjectsRepository
    }

    @Override
    public void logicalDeleteSubjects(int id) { // Заменено на SubjectsModel
        subjectsRepository.logicalDeleteSubjects(id); // Логическое удаление
    }

    @Override
    public List<SubjectsModel> findBySubjectsName(String subjectsName) { // Заменено на SubjectsModel
        return subjectsRepository.findBySubjectsName(subjectsName); // Поиск
    }

    @Override
    public List<SubjectsModel> filterSubjects(String subjectsName, Boolean deleted, Integer id) { // Заменено на SubjectsModel
        return subjectsRepository.filterSubjects(subjectsName, deleted, id); // Фильтрация
    }

    @Override
    public void logicalDeleteMultipleSubjects(List<Integer> ids) { // Заменено на SubjectsModel
        subjectsRepository.logicalDeleteMultipleSubjects(ids); // Множественное логическое удаление
    }
}
