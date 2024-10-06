package com.example.demo.service;

import com.example.demo.entity.Attempt;
import com.example.demo.repository.AttemptRepository;
import com.example.demo.dto.SurveyAttempt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttemptService {

    @Autowired
    private AttemptRepository attemptRepository;

    /**
     * XXX assuming dummy data
     * @param givenAttempt
     * @return
     */
    public Attempt save(SurveyAttempt givenAttempt) {
        Attempt storedAttempt = new Attempt();
        storedAttempt.setAnswers(givenAttempt.getAnswers());
        storedAttempt.setTestId(givenAttempt.getTestId());
        storedAttempt.setUsername("dummy");
        return attemptRepository.save(storedAttempt);
    }
}
