package com.cookandroid.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TriangleShapeActivity extends AppCompatActivity {
    private Button RectangleShapeButton, RoundedShapeButton, HourglassShapeButton,
            TriangleShapeButton, TriangleShapeFashionButton1, TriangleShapeFashionButton2,
            TriangleShapeFashionButton3, TriangleShapeFashionButton4;
    private Button homeButton, categoryButton, myFitButton, myPageButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle_activity);

        RectangleShapeButton = findViewById(R.id.RectangleShapeButton);
        RoundedShapeButton = findViewById(R.id.RoundedShapeButton);
        HourglassShapeButton = findViewById(R.id.HourglassShapeButton);
        TriangleShapeButton = findViewById(R.id.TriangleShapeButton);
        TriangleShapeFashionButton1 = findViewById(R.id.TriangleShapeFashionButton1);
        TriangleShapeFashionButton2 = findViewById(R.id.TriangleShapeFashionButton2);
        TriangleShapeFashionButton3 = findViewById(R.id.TriangleShapeFashionButton3);
        TriangleShapeFashionButton4 = findViewById(R.id.TriangleShapeFashionButton4);
        /*
        RectangleShapeFashionButton5 = findViewById(R.id.RectangleShapeFashionButton5);
        RectangleShapeFashionButton6 = findViewById(R.id.RectangleShapeFashionButton6);*/

        homeButton = findViewById(R.id.homeButton);
        categoryButton = findViewById(R.id.categoryButton);
        myFitButton = findViewById(R.id.myFitButton);
        myPageButton = findViewById(R.id.myPageButton);

        categoryButton.setOnClickListener(null);
        TriangleShapeButton.setOnClickListener(null);

        RoundedShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TriangleShapeActivity.this, RoundedShapeActivity.class);
                startActivity(intent);
            }
        });

        RectangleShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TriangleShapeActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });

        HourglassShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TriangleShapeActivity.this, HourglassShapeActivity.class);
                startActivity(intent);
            }
        });

        TriangleShapeFashionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TriangleShapeActivity.this, RectangleFashion1Activity.class);
                startActivity(intent);
            }
        });

        TriangleShapeFashionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TriangleShapeActivity.this, RectangleFashion2Activity.class);
                startActivity(intent);
            }
        });

        TriangleShapeFashionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TriangleShapeActivity.this, RectangleFashion3Activity.class);
                startActivity(intent);
            }
        });

        TriangleShapeFashionButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TriangleShapeActivity.this, RectangleFashion4Activity.class);
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
                Intent intent = new Intent(TriangleShapeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        myFitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TriangleShapeActivity.this, MyFitActivity.class);
                startActivity(intent);
            }
        });

        myPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TriangleShapeActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });
    }
}
