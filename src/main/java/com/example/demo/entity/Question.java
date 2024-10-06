package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String statement;
    private String [] badOptions;
    private String rightOption;

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String[] getBadOptions() {
        return badOptions;
    }

    public void setBadOptions(String[] badOptions) {
        this.badOptions = badOptions;
    }

    public String getRightOption() {
        return rightOption;
    }
    //TODO move this method to shownQuestion
    public String[] getOptions() {
        int size = badOptions.length;
        String [] result = new String[size + 1];
        System.arraycopy(badOptions, 0, result, 0, size);
        result[size] = rightOption;
        Collections.shuffle(Arrays.asList(result));
        return result;
    }

    public void setRightOption(String rightOption) {
        this.rightOption = rightOption;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}