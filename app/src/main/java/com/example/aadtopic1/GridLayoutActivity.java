package com.example.aadtopic1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GridLayoutActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etOutput;
    Button btnClear, btnRemainder, btnBack, btnDivision, btnSeven,
            btnEight, btnNine, btnMultiplication, btnFour, btnFive, btnSix,
            btnSubtraction, btnOne, btnTwo, btnThree, btnAddition, btnDbZero,
            btnZero, btnDecimal, btnEqual;


    StringBuilder operations = new StringBuilder();


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


        //seting onClickLIstener for all the widgets

        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnRemainder.setOnClickListener(this);
        btnBack.setOnClickListener(this);
        btnAddition.setOnClickListener(this);
        btnSubtraction.setOnClickListener(this);
        btnMultiplication.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnDecimal.setOnClickListener(this);
        btnZero.setOnClickListener(this);
        btnDbZero.setOnClickListener(this);
        btnEqual.setOnClickListener(this);
        etOutput.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {

        etOutput.setError(null);

        switch (v.getId()) {
            case R.id.btnZero:
                this.operations.append("0");
                break;
            case R.id.btnDbZero:
                this.operations.append("00");
                break;
            case R.id.btnOne:
                this.operations.append("1");
                break;
            case R.id.btnTwo:
                this.operations.append("2");
                break;
            case R.id.btnThree:
                this.operations.append("3");
                break;
            case R.id.btnFour:
                this.operations.append("4");
                break;
            case R.id.btnFive:
                this.operations.append("5");
                break;
            case R.id.btnSix:
                this.operations.append("6");
                break;
            case R.id.btnSeven:
                this.operations.append("7");
                break;
            case R.id.btnEight:
                this.operations.append("8");
                break;
            case R.id.btnNine:
                this.operations.append("9");
                break;
            case R.id.btnAddition:
                this.operations.append("+");
                break;
            case R.id.btnSubtraction:
                this.operations.append("-");
                break;
            case R.id.btnMultiplication:
                this.operations.append("*");
                break;
            case R.id.btnDivision:
                this.operations.append("/");
                break;
            case R.id.btnRemainder:
                this.operations.append("%");
                break;
            case R.id.btnDecimal:
                this.operations.append(".");
                break;
            case R.id.btnEqual:
                if (this.operations.toString().contains(".")) {
                    this.etOutput.setError("Cannot calculate decimal values!!!");
                    return;
                }

                String result = CalculatorOperations.operationsCalc(this.operations.toString());
                this.operations.delete(0, this.operations.length()).append(result);
                break;
            case R.id.btnBack:
                if (this.operations.length() <= 0) {
                    this.etOutput.setError("Empty operations");
                    return;
                }
                this.operations.deleteCharAt(this.operations.length() - 1);
                break;
            case R.id.btnClear:

                if (this.operations.length() <= 0) {
                    this.etOutput.setError("Empty operations");
                    return;
                }
                StringBuilder deletion = operations.delete(0, 100);
                break;
            default:
                throw new IllegalArgumentException();
        }
        this.etOutput.setText(this.operations);


    }
}
