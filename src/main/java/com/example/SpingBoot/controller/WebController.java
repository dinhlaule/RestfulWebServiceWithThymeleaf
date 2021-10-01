package com.example.SpingBoot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/profile")
    public String profile(Model model){
        // Tạo ra thông tin
        List<Info> profile = new ArrayList<>();
        profile.add(new Info("fullname", "Le Dinh Lau"));
        profile.add(new Info("nickname", "Dev Jan"));
        profile.add(new Info("gmail", "@gmail.com"));
        profile.add(new Info("facebook", "https://www.facebook.com/"));

        // Đưa thông tin vào Model
        model.addAttribute("lodaProfile", profile);
        
        // Trả về template profile.html
        return "profile";
    }
}
