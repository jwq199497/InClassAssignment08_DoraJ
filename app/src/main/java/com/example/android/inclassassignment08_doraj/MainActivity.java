package com.example.android.inclassassignment08_doraj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Question> question;
//    Question australia = new Question(R.string.australia,R.string.question_australia, R.drawable.australia, true);
//    Question africa = new Question(R.string.africa,R.string.question_africa, R.drawable.africa, false);
//    Question middle_east = new Question(R.string.middle_east,R.string.question_mideast, R.drawable.mideast, false);
//    Question oceans = new Question(R.string.oceans,R.string.question_oceans, R.drawable.oceans, true);
//    Question americas = new Question(R.string.americas,R.string.question_america, R.drawable.americas, true);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        question = new ArrayList<>();
//        question.add(australia);
//        question.add(africa);
//        question.add(middle_east);
//        question.add(oceans);
//        question.add(americas);

        initiaData();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new QuestionsAdapter(question,this));
    }


    private void initiaData(){
        question = new ArrayList<>();
        question.add(new Question(R.string.australia,R.string.question_australia, R.drawable.australia, true));
        question.add(new Question(R.string.africa,R.string.question_africa, R.drawable.africa, false));
        question.add(new Question(R.string.middle_east,R.string.question_mideast, R.drawable.mideast, false));
        question.add(new Question(R.string.oceans,R.string.question_oceans, R.drawable.oceans, true));
        question.add(new Question(R.string.americas,R.string.question_america, R.drawable.americas, true));
    }
}

