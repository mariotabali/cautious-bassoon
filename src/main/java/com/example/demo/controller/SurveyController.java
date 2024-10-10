package com.example.demo.controller;

import com.example.demo.dto.ShownQuestion;
import com.example.demo.entity.Question;
import com.example.demo.entity.Survey;
import com.example.demo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    @GetMapping("/{id}")
    public ResponseEntity<Set<ShownQuestion>> getSurveyById(@PathVariable Long id) {
        Survey survey = surveyService.findById(id);
        if (survey != null) {
            Set<ShownQuestion> newQuestions = ShownQuestion.toRandomizedQuestions(survey);
            return ResponseEntity.ok(newQuestions);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Survey createSurvey(@RequestBody Survey survey) {
        return surveyService.save(survey);
    }
}
