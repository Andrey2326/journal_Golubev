package com.mpt.journal.controller;

import com.mpt.journal.model.SubjectsModel; // Изменено на SubjectsModel
import com.mpt.journal.service.SubjectsService; // Изменено на SubjectsService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SubjectsController { // Изменено на SubjectsController

    @Autowired
    private SubjectsService subjectsService; // Изменено на SubjectsService

    @GetMapping("/subjects") // Изменено на /subjects
    public String getAllSubjects(Model model) { // Изменено на getAllSubjects
        model.addAttribute("subjects", subjectsService.findAllSubjects()); // Изменено на subjectsService и subjects
        return "subjectsList"; // Изменено на subjectsList
    }

    @PostMapping("/subjects/add") // Изменено на /subjects/add
    public String addSubjects(@RequestParam String subjectsName) { // Изменено на subjectsName
        SubjectsModel newSubject = new SubjectsModel(0, subjectsName); // Изменено на SubjectsModel и newSubject
        subjectsService.addSubjects(newSubject); // Изменено на subjectsService и addSubjects
        return "redirect:/subjects"; // Изменено на /subjects
    }

    @PostMapping("/subjects/update") // Изменено на /subjects/update
    public String updateSubjects(@RequestParam int id, @RequestParam String subjectsName) { // Изменено на subjectsName
        SubjectsModel updatedSubject = new SubjectsModel(id, subjectsName); // Изменено на SubjectsModel и updatedSubject
        subjectsService.updateSubjects(updatedSubject); // Изменено на subjectsService и updateSubjects
        return "redirect:/subjects"; // Изменено на /subjects
    }

    @PostMapping("/subjects/delete") // Изменено на /subjects/delete
    public String deleteSubjects(@RequestParam int id) { // Изменено на deleteSubjects
        subjectsService.deleteSubjects(id); // Изменено на deleteSubjects
        return "redirect:/subjects"; // Изменено на /subjects
    }

    @GetMapping("/subjects/search") // Изменено на /subjects/search
    public String searchSubjects(@RequestParam String subjectsName, Model model) { // Изменено на subjectsName
        model.addAttribute("subjects", subjectsService.findBySubjectsName(subjectsName)); // Изменено на subjectsService и subjects
        return "subjectsList"; // Изменено на subjectsList
    }

    @GetMapping("/subjects/filter") // Изменено на /subjects/filter
    public String filterSubjects(@RequestParam(required = false) String subjectsName, // Изменено на subjectsName
                                 @RequestParam(required = false) Boolean deleted,
                                 @RequestParam(required = false) Integer id,
                                 Model model) {
        model.addAttribute("subjects", subjectsService.filterSubjects(subjectsName, deleted, id)); // Изменено на subjectsService и subjects
        return "subjectsList"; // Изменено на subjectsList
    }

    @PostMapping("/subjects/deleteMultiple") // Изменено на /subjects/deleteMultiple
    public String deleteMultipleSubjects(@RequestParam List<Integer> ids) { // Изменено на deleteMultipleSubjects
        subjectsService.logicalDeleteMultipleSubjects(ids); // Изменено на logicalDeleteMultipleSubjects
        return "redirect:/subjects"; // Изменено на /subjects
    }

    @PostMapping("/subjects/delete/logical") // Изменено на /subjects/delete/logical
    public String logicalDeleteSubjects(@RequestParam int id) { // Изменено на logicalDeleteSubjects
        subjectsService.logicalDeleteSubjects(id); // Изменено на logicalDeleteSubjects
        return "redirect:/subjects"; // Изменено на /subjects
    }

    @PostMapping("/subjects/deletePermanent") // Изменено на /subjects/deletePermanent
    public String deletePermanentSubjects(@RequestParam int id) { // Изменено на deletePermanentSubjects
        subjectsService.deleteSubjects(id); // Изменено на deleteSubjects
        return "redirect:/subjects"; // Изменено на /subjects
    }
}

