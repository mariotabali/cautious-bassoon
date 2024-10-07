package com.example.demo.controller;

import com.example.demo.entity.Attempt;
import com.example.demo.service.AttemptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.dto.SurveyAttempt;

@RestController
@RequestMapping("/api/attempt")
public class AttemptController {

    @Autowired
    private AttemptService attemptService;

    /**
     * Stores an attempt
     *
     * @param attempt an attempt as sent by front
     * @return saved attempt
     */
    @PostMapping
    public Attempt processAttempt(@RequestBody SurveyAttempt attempt) {
        System.out.println(attempt.toString());
        return attemptService.save(attempt);
    }

    /**
     * Stores an attempt and requests a score
     *
     * @param attempt an attempt as sent by front
     * @return score
     */
    @GetMapping("/score/{attemptId}")
    public PercentageResponse showAttemptEvaluation(@PathVariable Long attemptId) {
        return new PercentageResponse(88);
    }

    public static class PercentageResponse {
        private double percentage;

        public PercentageResponse(double percentage) {
            this.percentage = percentage;
        }

        public double getPercentage() {
            return percentage;
        }

        public void setPercentage(double percentage) {
            this.percentage = percentage;
        }
    }
}