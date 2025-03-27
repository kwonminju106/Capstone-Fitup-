package com.cookandroid.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RoundedShapeActivity extends AppCompatActivity {
    private Button RectangleShapeButton, RoundedShapeButton, HourglassShapeButton,
            TriangleShapeButton, RoundedShapeFashionButton1, RoundedShapeFashionButton2,
            RoundedShapeFashionButton3, RoundedShapeFashionButton4;
    private Button homeButton, categoryButton, myFitButton, myPageButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rounded_activity);

        RectangleShapeButton = findViewById(R.id.RectangleShapeButton);
        RoundedShapeButton = findViewById(R.id.RoundedShapeButton);
        HourglassShapeButton = findViewById(R.id.HourglassShapeButton);
        TriangleShapeButton = findViewById(R.id.TriangleShapeButton);
        RoundedShapeFashionButton1 = findViewById(R.id.RoundedShapeFashionButton1);
        RoundedShapeFashionButton2 = findViewById(R.id.RoundedShapeFashionButton2);
        RoundedShapeFashionButton3 = findViewById(R.id.RoundedShapeFashionButton3);
        RoundedShapeFashionButton4 = findViewById(R.id.RoundedShapeFashionButton4);
        /*
        RectangleShapeFashionButton5 = findViewById(R.id.RectangleShapeFashionButton5);
        RectangleShapeFashionButton6 = findViewById(R.id.RectangleShapeFashionButton6);*/

        homeButton = findViewById(R.id.homeButton);
        categoryButton = findViewById(R.id.categoryButton);
        myFitButton = findViewById(R.id.myFitButton);
        myPageButton = findViewById(R.id.myPageButton);

        categoryButton.setOnClickListener(null);
        RoundedShapeButton.setOnClickListener(null);

        HourglassShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoundedShapeActivity.this, HourglassShapeActivity.class);
                startActivity(intent);
            }
        });

        RectangleShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoundedShapeActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });

        TriangleShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoundedShapeActivity.this, TriangleShapeActivity.class);
                startActivity(intent);
            }
        });

        RoundedShapeFashionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoundedShapeActivity.this, RectangleFashion1Activity.class);
                startActivity(intent);
            }
        });

        RoundedShapeFashionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoundedShapeActivity.this, RectangleFashion2Activity.class);
                startActivity(intent);
            }
        });

        RoundedShapeFashionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoundedShapeActivity.this, RectangleFashion3Activity.class);
                startActivity(intent);
            }
        });

        RoundedShapeFashionButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoundedShapeActivity.this, RectangleFashion4Activity.class);
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
                Intent intent = new Intent(RoundedShapeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        myFitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoundedShapeActivity.this, MyFitActivity.class);
                startActivity(intent);
            }
        });

        myPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoundedShapeActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });
    }
}
