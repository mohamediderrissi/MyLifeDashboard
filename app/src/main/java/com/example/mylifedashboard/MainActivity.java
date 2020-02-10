package com.example.mylifedashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView card1;
    CardView card2;
    CardView card3;
    CardView card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        card1 = findViewById(R.id.card1);
        card2 = findViewById(R.id.card2);
        card3 = findViewById(R.id.card3);
        card4 = findViewById(R.id.card4);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urgentAndImportant();
            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notUrgentAndImportant();
            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urgentAndNotImportant();
            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notUrgentAndNotImportant();
            }
        });
    }



    public void urgentAndImportant()
    {
        System.out.println("urgentAndImportant");
    }

    public void notUrgentAndImportant()
    {
        System.out.println("notUrgentAndImportant");
    }
    public void urgentAndNotImportant()
    {
        System.out.println("urgentAndNotImportant");
    }
    public void notUrgentAndNotImportant()
    {
        System.out.println("notUrgentAndNotImportant");
    }
}
