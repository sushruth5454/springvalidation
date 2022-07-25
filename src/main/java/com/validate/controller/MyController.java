package com.validate.controller;

import com.validate.entity.LoginData;
import org.springframework.boot.Banner;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MyController {

    @GetMapping("/form")
    public String openForm(Model model) {
        model.addAttribute("loginData", new LoginData());
        return "form";
    }

    @PostMapping("/process")
    public String processData(@Valid @ModelAttribute("loginData") LoginData loginData, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println(result);
            return "form";
        }
        System.out.println(loginData);
        return "success";
    }
}
