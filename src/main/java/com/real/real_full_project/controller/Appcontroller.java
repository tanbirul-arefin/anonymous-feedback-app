package com.real.real_full_project.controller;

import com.real.real_full_project.model.Feedback;
import com.real.real_full_project.service.FeedbackService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class Appcontroller {

    private final FeedbackService feedbackService;

    @GetMapping({"/", "/home"})
    public String homePage(Model model) {
        List<Feedback> feedbacks = feedbackService.getFeedbacks();
        model.addAttribute("feedbacks", feedbacks);
    return "home-page";
    }
}

