package com.cookandroid.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {
    private Button RectangleShapeButton, RoundedShapeButton, HourglassShapeButton,
            TriangleShapeButton, RectangleShapeFashionButton1, RectangleShapeFashionButton2,
            RectangleShapeFashionButton3, RectangleShapeFashionButton4, RectangleShapeFashionButton5,
            RectangleShapeFashionButton6;
    private Button homeButton, categoryButton, myFitButton, myPageButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_activity);

        RectangleShapeButton = findViewById(R.id.RectangleShapeButton);
        RoundedShapeButton = findViewById(R.id.RoundedShapeButton);
        HourglassShapeButton = findViewById(R.id.HourglassShapeButton);
        TriangleShapeButton = findViewById(R.id.TriangleShapeButton);
        RectangleShapeFashionButton1 = findViewById(R.id.RectangleShapeFashionButton1);
        RectangleShapeFashionButton2 = findViewById(R.id.RectangleShapeFashionButton2);
        RectangleShapeFashionButton3 = findViewById(R.id.RectangleShapeFashionButton3);
        RectangleShapeFashionButton4 = findViewById(R.id.RectangleShapeFashionButton4);

        homeButton = findViewById(R.id.homeButton);
        categoryButton = findViewById(R.id.categoryButton);
        myFitButton = findViewById(R.id.myFitButton);
        myPageButton = findViewById(R.id.myPageButton);

        categoryButton.setOnClickListener(null);
        RectangleShapeButton.setOnClickListener(null);

        RoundedShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, RoundedShapeActivity.class);
                startActivity(intent);
            }
        });

        HourglassShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, HourglassShapeActivity.class);
                startActivity(intent);
            }
        });

        TriangleShapeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, TriangleShapeActivity.class);
                startActivity(intent);
            }
        });

        RectangleShapeFashionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, RectangleFashion1Activity.class);
                startActivity(intent);
            }
        });

        RectangleShapeFashionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, RectangleFashion2Activity.class);
                startActivity(intent);
            }
        });

        RectangleShapeFashionButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, RectangleFashion3Activity.class);
                startActivity(intent);
            }
        });

        RectangleShapeFashionButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, RectangleFashion4Activity.class);
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
                Intent intent = new Intent(CategoryActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        myFitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, MyFitActivity.class);
                startActivity(intent);
            }
        });

        myPageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryActivity.this, MyPageActivity.class);
                startActivity(intent);
            }
        });
    }
}
