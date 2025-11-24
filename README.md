"# Quiz-App" 

Animal Name Guessing Quiz App – Project Documentation

 Project Description :-
 
 The Animal Name Guessing Quiz App is an interactive Android application built using Kotlin. It allows users to identify animals based on displayed images. The app presents multiple-choice questions, tracks progress, calculates the final score, and displays the result on a dedicated screen. Users must enter their name before starting the quiz, and upon completion, the app shows their score along with a congratulatory message.
 
 
 Features :-
 
 • User enters their name to begin the quiz.
 
 • Displays animal images with four answer options.
 
 • Highlights selected answers and shows correct/wrong responses.
 
 • Horizontal progress bar tracking question number.
 
 • Final result screen showing name and score.
 

 Tech Stack :-
 
 • Kotlin
 • Android Studio
 • ConstraintLayout, LinearLayout, CardView
 

 App Flow :-
 
 -MainActivity → QuestionsActivity → ResultActivity
 
 
 Data Model :-
 
 -Each question contains: ID, question text, image, four options, and correct answer index.
 
 
 Class: Question :-
 
  -id:Int, question:String, image:Int, optionOne:String, optionTwo:String, optionThree:String, optionFour:String, correctAnswer:Int

 Class: MainActivity :-
 
  -name input, start quiz button

 Class: QuestionsActivity :-
  - Loads question list
  - Handles answer selection
  - Displays images & options
  - Calculates score

 Class: ResultActivity :-
  - Displays score & username
  - Finish button returns to MainActivity

 Flowchart of Quiz Logic :-
 
  Start → User Enters Name → Load Questions → Show Question → User Selects Option → User Clicks CHECK → IF Correct → Increase Score ELSE → Highlight Wrong Answer → Show NEXT → Load Next Question → IF Last Question → Show Result Screen → End.
