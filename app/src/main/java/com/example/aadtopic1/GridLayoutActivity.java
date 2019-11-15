package com.example.aadtopic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class GridLayoutActivity extends AppCompatActivity {

    EditText etOutput;
    Button btnClear, btnRemainder, btnBack, btnDivision, btnSeven,
            btnEight, btnNine, btnMultiplication, btnFour, btnFive, btnSix,
            btnSubtraction, btnOne, btnTwo, btnThree, btnAddition, btnDbZero,
            btnZero, btnDecimal, btnEqual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);

        //Binding the widgets

        etOutput = (EditText) findViewById(R.id.etOutput);
        btnClear = (Button) findViewById(R.id.btnClear);
        btnRemainder = (Button) findViewById(R.id.btnRemainder);
        btnBack = (Button) findViewById(R.id.btnBack);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnDbZero = (Button) findViewById(R.id.btnDbZero);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnDecimal = (Button) findViewById(R.id.btnDecimal);
        btnEqual = (Button) findViewById(R.id.btnEqual);




















    }
}
