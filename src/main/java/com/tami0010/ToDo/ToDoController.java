package com.tami0010.ToDo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {

    @GetMapping("/")
    public String hello() {
        return "To-do Application !";
    }
}
