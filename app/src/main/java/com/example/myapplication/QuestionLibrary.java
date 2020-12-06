package com.example.myapplication;

public class QuestionLibrary {

    private String mQuestion [] = {
            "Which animal can fly?",
            "Which animal is the tallest animal?",
            "Which animal is a mammal?",
            "The ________ is known as the king of the jungle"
    };

    private String mAnswer [] [] = {
            {"Chicken","Eagle","Ostrich"},
            {"Elephant","Bear","Giraffe"},
            {"Crocodile","Snake","Whale"},
            {"Panther","Lion","Zebra"},
    };

    private String mCorrectAnswer [] = {"Eagle","Giraffe","Whale","Lion"};


    public String getQuestion(int a) {
        String question = mQuestion [a];
        return question;
    }

    public String getAnswer1(int a) {
        String answer0 = mAnswer[a][0];
        return answer0;
    }

    public String getAnswer2(int a) {
        String choice1 = mAnswer[a][1];
        return choice1;
    }

    public String getAnswer3(int a) {
        String answer2 = mAnswer[a][2];
        return answer2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswer[a];
        return answer;
    }

}
