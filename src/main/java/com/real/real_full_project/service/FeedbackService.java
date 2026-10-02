package com.real.real_full_project.service;


import com.real.real_full_project.model.Feedback;
import com.real.real_full_project.repository.FeedbackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@RequiredArgsConstructor
@Service
public class FeedbackService {

    private final FeedbackRepository feedbackRepository ;

    public List<Feedback> getFeedbacks() {
        List<Feedback> Feedbacks = feedbackRepository.findAll();

        for (Feedback feedback : Feedbacks) {
            feedback.setMessage(truncateMessage(feedback.getMessage()));
        }

        return Feedbacks;
    }

    private String truncateMessage(String message) {
        if (message != null && message.length() > 200) {
            return message.substring(0, 200) + " ...";
        } else {
            return message;
        }
    }

}