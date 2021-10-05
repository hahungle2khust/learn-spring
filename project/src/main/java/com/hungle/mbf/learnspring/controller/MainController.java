package com.hungle.mbf.learnspring.controller;

import com.hungle.mbf.learnspring.entities.Girl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/public/users")
public class MainController {

    @GetMapping(value="girl1")
    public Girl girl01() {
        return new Girl(1, "Ngọc Trinh");
    }

    @GetMapping(value = "/about")
    public String aboutMe() {
        return "HungLe";
    }
}
