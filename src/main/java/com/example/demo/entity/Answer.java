package com.example.demo.dto;

import jakarta.persistence.Embeddable;

@Embeddable
public class Answer {
    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    private Long questionId;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
    private String answer;
}

