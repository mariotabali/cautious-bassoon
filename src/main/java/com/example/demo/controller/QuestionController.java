package com.example.demo.controller;

import com.example.demo.dto.ShownQuestion;
import com.example.demo.entity.Question;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    
    @GetMapping("/{id}")
    public ResponseEntity<ShownQuestion> getQuestionById(@PathVariable Long id) {
        Question question = questionService.findById(id);
        if (question != null) {
            return ResponseEntity.ok(new ShownQuestion(question));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Question createQuestion(@RequestBody Question question) {
        System.out.println("blabla");
        return questionService.save(question);
    }
}