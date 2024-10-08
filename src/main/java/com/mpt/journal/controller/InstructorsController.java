package com.mpt.journal.controller;

import com.mpt.journal.service.InstructorsService; // Обновлено на InstructorsService
import org.springframework.stereotype.Controller;
import com.mpt.journal.model.InstructorsModel; // Обновлено на InstructorsModel
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InstructorsController { // Изменено на InstructorsController

    @Autowired
    private InstructorsService instructorsService; // Обновлено на InstructorsService

    @GetMapping("/instructors") // Изменено на /instructors
    public String getAllInstructors(Model model) { // Изменено на getAllInstructors
        model.addAttribute("instructors", instructorsService.findAllInstructors()); // Изменено на instructorsService и instructors
        return "instructorsList"; // Изменено на instructorsList, если у вас есть соответствующий шаблон
    }

    @PostMapping("/instructors/add") // Изменено на /instructors/add
    public String addInstructor(@RequestParam String name,
                                @RequestParam String lastName,
                                @RequestParam String firstName,
                                @RequestParam String middleName) {
        InstructorsModel newInstructor = new InstructorsModel(0, name, lastName, firstName, middleName); // Обновлено на InstructorsModel
        instructorsService.addInstructor(newInstructor); // Обновлено на instructorsService и addInstructor
        return "redirect:/instructors"; // Изменено на /instructors
    }

    @PostMapping("/instructors/update") // Изменено на /instructors/update
    public String updateInstructor(@RequestParam int id,
                                   @RequestParam String name,
                                   @RequestParam String lastName,
                                   @RequestParam String firstName,
                                   @RequestParam String middleName) {
        InstructorsModel updatedInstructor = new InstructorsModel(id, name, lastName, firstName, middleName); // Обновлено на InstructorsModel
        instructorsService.updateInstructor(updatedInstructor); // Обновлено на instructorsService и updateInstructor
        return "redirect:/instructors"; // Изменено на /instructors
    }

    @PostMapping("/instructors/delete") // Изменено на /instructors/delete
    public String deleteInstructor(@RequestParam int id) { // Изменено на deleteInstructor
        instructorsService.deleteInstructor(id); // Обновлено на deleteInstructor
        return "redirect:/instructors"; // Изменено на /instructors
    }
}
