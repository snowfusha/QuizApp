package com.example.quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var questionNo = 0
    var questions = listOf("რამდენია ოლიმპიური აუზის სიგრძე და სიგანე? \n\n A) სიგრძეში - 50მ,სიგანეში - 25მ \n\n B) სიგრძეში - 50მ,სიგანეში - 30მ \n\n C) სიგრძეში - 70მ,სიგანეში - 25მ", "რამდენია მოთამაშეა ბეისბოლის გუნდში \n\n A) 11 \n\n B) 9 \n\n C) 10", "რამდენია მედალი მოიგო ჩინეთმა ოლიმპიურ თამაშებზე პეკინში 2019 წელს? \n\n A) 100 \n\n B) 75 \n\n C) 25", "რა სიმაღლეზეა განთავსებული კალათი კალათბურთში? \n\n A) 3,05 \n\n B) 2,75 \n\n C) 3,25","რა ბურთით თამაშობდნენ კალათბურთს 1894 წლამდე? \n\n A) ფრენბურთის ბურთით \n\n B) ტენისის ბურთით \n\n C) ფეხბურთის ბურთით","რომელმა ქვეყანამ მოიგო მსოფლიო 2014 წელს? \n\n A) გერმანიამ \n\n B) იტალიამ \n\n C) პორტუგალიამ","რომელ წელს გაიმართა პირველი ზამთრის ოლიმპიური თამაშები? \n\n A) 1919 წელს \n\n B) 1924 წელს \n\n C) 1932 წელს","რომელ ქვეყნიდანაა ლეგენდარული ბოქსიორი - Manny Pacquiao? \n\n A) ფილიპინები \n\n B) კორეა \n\n C) ჩინეთი","რომელი სპორტი ითვლება ნაციონალურ სპორტად კანადაში? \n\n A) ამერიკული ფეხბურთი \n\n B) ლაკროსი \n\n C) კალათბურთი" )
    var rightAnswers = listOf(1, 2, 1, 1, 3, 1, 2, 3, 1, 2)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            showToast(1)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            showToast(2)
        }

        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            showToast(3)
        }

    }

    fun showToast(answer: Int) {
        if (answer==rightAnswers.get(questionNo)) {
            Toast.makeText(applicationContext, "სწორია", Toast.LENGTH_SHORT).show()
            updateQuestion()
        } else {
            Toast.makeText(applicationContext, "ნწ,ნწ", Toast.LENGTH_SHORT).show()
        }
    }

    fun updateQuestion() {
        questionNo = questionNo + 1
        val textView = findViewById<TextView>(R.id.textView)
        textView.setText(questions.get(questionNo))
    }

}