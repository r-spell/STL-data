package com.example.STLdata.models;

public abstract class Question {

    private String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionText() {
        return questionText;
    }

}


