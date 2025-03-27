package com.cookandroid.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HourglassShapeActivity extends AppCompatActivity {
    private Button RectangleShapeButton, RoundedShapeButton, HourglassShapeButton,
            TriangleShapeButton, HourglassShapeFashionButton1, HourglassShapeFashionButton2,
            HourglassShapeFashionButton3, HourglassShapeFashionButton4;
    private Button homeButton, categoryButton, myFitButton, myPageButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hourglass_activity);

        RectangleShapeButton = findViewById(R.id.RectangleShapeButton);
        RoundedShapeButton = findViewById(R.id.RoundedShapeButton);
        HourglassShapeButton = findViewById(R.id.HourglassShapeButton);
        TriangleShapeButton = findViewById(R.id.TriangleShapeButton);
        HourglassShapeFashionButton1 = findViewById(R.id.HourglassShapeFashionButton1);
        HourglassShapeFashionButton2 = findViewById(R.id.HourglassShapeFashionButton2);
        HourglassShapeFashionButton3 = findViewById(R.id.HourglassShapeFashionButton3);
        HourglassShapeFashionButton4 = findViewById(R.id.HourglassShapeFashionButton4);
        /*
        RectangleShapeFashionButton5 = findViewById(R.id.RectangleShapeFashionButton5);
        RectangleShapeFashionButton6 = findViewById(R.id.RectangleShapeFashionButton6);*/

        homeButton = findViewById(R.id.homeButton);
        categoryButton = findViewById(R.id.categoryButton);
        myFitButton = findViewById(R.id.myFitButton);
        myPageButton = findViewById(R.id.myPageButton);

        categoryButton.setOnClickListener(null);
        HourglassShapeButton.setOnClickListener(null);

        RoundedShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HourglassShapeActivity.this, RoundedShapeActivity.class);
                startActivity(intent);
            }
        });

        RectangleShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HourglassShapeActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });

        TriangleShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HourglassShapeActivity.this, TriangleShapeActivity.class);
                startActivity(intent);
            }
        });

        HourglassShapeFashionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HourglassShapeActivity.this, RectangleFashion1Activity.class);
                startActivity(intent);
            }
        });

        HourglassShapeFashionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HourglassShapeActivity.this, RectangleFashion2Activity.class);
                startActivity(intent);
            }
        });

        HourglassShapeFashionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HourglassShapeActivity.this, RectangleFashion3Activity.class);
                startActivity(intent);
            }
        });

        HourglassShapeFashionButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HourglassShapeActivity.this, RectangleFashion4Activity.class);
                startActivity(intent);
            }
        });
/*
        RectangleShapeFashionButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, RectangleFashion5Activity.class);
                startActivity(intent);
            }
        });

        RectangleShapeFashionButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, RectangleFashion6Activity.class);
                startActivity(intent);
            }
        });*/

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HourglassShapeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        myFitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HourglassShapeActivity.this, MyFitActivity.class);
                startActivity(intent);
            }
        });

        myPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HourglassShapeActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });
    }
}
