package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.SurveyRepository;
import com.example.demo.repository.QuestionRepository;
import com.example.demo.entity.Survey;
import com.example.demo.entity.Question;
import java.util.Set;

@Service
public class SurveyService {

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public Survey createSurvey(Survey survey) {
        return surveyRepository.save(survey);
    }

    public Question createQuestion(Question question) {
        return questionRepository.save(question);
    }

    public void addQuestionToSurvey(Long surveyId, Long questionId) {
        Survey survey = surveyRepository.findById(surveyId).orElseThrow(() -> new RuntimeException("Survey not found"));
        Question question = questionRepository.findById(questionId).orElseThrow(() -> new RuntimeException("Question not found"));

        survey.getQuestions().add(question);
        surveyRepository.save(survey);
    }

    public Set<Question> getQuestionsForSurvey(Long surveyId) {
        Survey survey = surveyRepository.findById(surveyId).orElseThrow(() -> new RuntimeException("Survey not found"));
        return survey.getQuestions();
    }

    public Survey findById(Long id) {
        return surveyRepository.findById(id).orElse(null);
    }

    public Survey save(Survey survey) {
        return surveyRepository.save(survey);
    }
}
