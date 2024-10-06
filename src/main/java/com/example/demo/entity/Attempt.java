package com.example.demo.entity;

import com.example.demo.dto.Answer;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "attempts")
public class Attempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attemptId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public Long getTestId() {
        return testId;
    }

    public void setTestId(Long testId) {
        this.testId = testId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    private String title;
    private Instant moment;
    private Long testId;
    private String username;

    @ElementCollection
    @CollectionTable(name = "attempt_answers", joinColumns = @JoinColumn(name = "attempt_id"))
    private List<Answer> answers;

}
