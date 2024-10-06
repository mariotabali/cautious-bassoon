package com.example.demo.dto;

import com.example.demo.entity.Question;

public class ShownQuestion {
    Long id;

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    String statement;
    String[] options;

    public ShownQuestion() {

    }

    public ShownQuestion(Question q) {
        this.statement = q.getStatement();
        this.id = q.getId();
        this.options = q.getOptions();
    }
}
