package com.example.demo.dto;

import java.util.List;

public class SurveyAttempt {

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    private Long testId;

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    private List <Answer> answers;
}
