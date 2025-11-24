package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question

object Constants {
            const val USER_NAME = "user_name"
            const val TOTAL_QUESTIONS = "total_questions"
            const val SCORE = "correct_answers"

            fun getQuestions(): MutableList<Question> {
                        val questions = mutableListOf<Question>()

                        val quest1 = Question(
                                    1, "What is the name of the animal in the picture?",
                                    R.drawable.cat, "Cat",
                                    "Lion", "Tiger",
                                    "Dog",
                                    1
                        )
                        questions.add(quest1)

                        val quest2 = Question(
                                    2, "What is the name of the animal in the picture?",
                                    R.drawable.dog,
                                    "Horse", "Dog",
                                    "Elephant", "Giraffe",
                                    2
                        )
                        questions.add(quest2)

                        val quest3 = Question(
                                    3, "What is the name of the animal in the picture?",
                                    R.drawable.elephant,
                                    "Hippo", "Rhino",
                                    "Cheetah", "Elephant",
                                    4
                        )
                        questions.add(quest3)

                        val quest4 = Question(
                                    4, "What is the name of the animal in the picture?",
                                    R.drawable.fox,
                                    "Cat", "Monkey",
                                    "Arctic Fox", "Squirrel",
                                    3
                        )
                        questions.add(quest4)

                        val quest5 = Question(
                                    5, "What is the name of the animal in the picture?",
                                    R.drawable.horse,
                                    "Horse", "Dinosaur",
                                    "Elephant", "Bison",
                                    1
                        )
                        questions.add(quest5)

                        val quest6 = Question(
                                    6, "What is the name of the animal in the picture?",
                                    R.drawable.leopard,
                                    "Deer", "Leopard",
                                    "Chimpanzee", "Donkey",
                                    2
                        )
                        questions.add(quest6)

                        val quest7 = Question(
                                    7, "What is the name of the animal in the picture?",
                                    R.drawable.lion,
                                    "Panda", "Tiger",
                                    "Lion", "Cow",
                                    3
                        )
                        questions.add(quest7)

                        val quest8 = Question(
                                    8, "What is the name of the animal in the picture?",
                                    R.drawable.raccoon,
                                    "Buffalo", "Sheep",
                                    "Bear", "Racoon",
                                    4
                        )
                        questions.add(quest8)

                        val quest9 = Question(
                                    9, "What is the name of the animal in the picture?",
                                    R.drawable.squirrel,
                                    "Rat", "Squirrel",
                                    "Snake", "Ox",
                                    2
                        )
                        questions.add(quest9)

                        val quest10 = Question(
                                    10, "What is the name of the animal in the picture?",
                                    R.drawable.zebra,
                                    "Leopard", "Jaguar",
                                    "Zebra", "Panda",
                                    3
                        )
                        questions.add(quest10)
                        return questions
            }
}
