package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "surveys")
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
            name = "survey_questions",
            joinColumns = @JoinColumn(name = "survey_id"),
            inverseJoinColumns = @JoinColumn(name = "question_id")
    )
    private Set<Question> questions; // A survey can contain many question

    public Set <Question> getQuestions() {
        return questions;
    }
}
