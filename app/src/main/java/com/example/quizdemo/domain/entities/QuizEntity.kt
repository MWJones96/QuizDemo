package com.example.quizdemo.domain.entities

data class QuizQuestionEntity (val question: String, val answers: List<String>, val correctAnswer: String)

data class QuizQuestionListEntity (val quizQuestions: List<QuizQuestionEntity>)