package pl.dawid.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.dawid.dao.StudentDAO;
import pl.dawid.model.Student;

import java.util.List;

@Controller
public class StudentController {

    private final StudentDAO studentDAO;

    public StudentController(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @GetMapping("studentForm")
    public String getStudentForm(Model model) {
        model.addAttribute("student", new Student());
        return "studentForm";
    }

    @GetMapping("student")
    public String getStudentList(Model model) {
        model.addAttribute("students", studentDAO.get());
        return "student";
    }

    @PostMapping("student")
    public String save(@ModelAttribute Student student) {
        studentDAO.save(student);
        return "index";
    }

    @GetMapping("student/delete")
    public String delete(@RequestParam Long id) {
        studentDAO.delete(id);
        return "redirect:/student";
    }
}
