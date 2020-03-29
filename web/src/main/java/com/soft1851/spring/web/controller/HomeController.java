package com.soft1851.spring.web.controller;

import com.soft1851.spring.web.entity.Books;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("home")
    public String home(Model model){
        model.addAttribute("message","Hello Spring Mvc");
        Books[] books = {
                new Books(1,"HTML","https://cdn.pixabay.com/photo/2020/03/19/00/55/sailing-4945855_1280.jpg"),
                new Books(2,"CSS","https://cdn.pixabay.com/photo/2020/03/20/10/18/mountains-4950252__340.jpg"),
//                new Books(3,"JavaScript","https://cdn.pixabay.com/photo/2020/03/19/18/29/camel-4948299__340.jpg"),
//                new Books(4,"Java","https://cdn.pixabay.com/photo/2017/08/10/05/18/home-2618511__340.jpg"),
                new Books(6,"Python","https://cdn.pixabay.com/photo/2020/03/17/16/37/landscape-4941043__340.jpg")
        };
        List<Books> booksList = Arrays.asList(books);
        model.addAttribute("booksList",booksList);
        return "home";
    }
}
