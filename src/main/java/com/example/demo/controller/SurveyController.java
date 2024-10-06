package com.example.demo.controller;

import com.example.demo.entity.Question;
import com.example.demo.entity.Survey;
import com.example.demo.service.SurveyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/surveys")
public class SurveyController {
    @Autowired
    private SurveyService surveyService;

    @GetMapping("/{id}")
    public ResponseEntity<Survey> getSurveyById(@PathVariable Long id) {
        Survey Survey = surveyService.findById(id);
        if (Survey != null) {
            return ResponseEntity.ok(Survey);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Survey createSurvey(@RequestBody Survey survey) {
        return surveyService.save(survey);
    }
}
