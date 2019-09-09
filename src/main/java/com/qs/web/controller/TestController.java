package com.qs.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.qs.bean.Student;
import com.qs.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/8/31 18:20
 */
@Controller
public class TestController {
    @Autowired
    private TestService service;

    @RequestMapping("/test")
    public String test(Model model) throws JsonProcessingException {
        // ModelAndView modelAndView = new ModelAndView("date");
        List<Student> students = service.getAll();

        // ObjectMapper mapper =new ObjectMapper();
        // String s = mapper.writeValueAsString(students);

        model.addAttribute("students",students);

        students.forEach(student -> System.out.println(student));

        return "date";


    }
}
