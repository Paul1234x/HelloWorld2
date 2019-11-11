package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//hallo erster comment
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Double   number1 = 0.0;
    private Double number2 = 0.0;
    private Double result = 0.0;
    private Integer operator = 0; //1 für +, 2 für -, 3 für * und 4 für / //


    private Button bOne;
    private Button bTwo;
    private Button bThree;
    private Button bFour;
    private Button bFive;
    private Button bSix;
    private Button bSeven;
    private Button bEight;
    private Button bNine;
    private Button bSero;
    private Button bEquals;
    private Button bPlus;
    private Button bMinus;
    private Button bMultyply;
    private Button bDivide;
    private Button bEarse;

    private TextView tvNumber1;
    private TextView tvNumber2;
    private TextView tvOperator;
    private TextView tvEqual;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bOne = this.findViewById(R.id.bOne);
        this.bTwo = this.findViewById(R.id.bTwo);
        this.bThree = this.findViewById(R.id.bThree);
        this.bFour = this.findViewById(R.id.bFour);
        this.bFive = this.findViewById(R.id.bFive);
        this.bSix = this.findViewById(R.id.bSix);
        this.bSeven = this.findViewById(R.id.bSeven);
        this.bEight = this.findViewById(R.id.bEight);
        this.bNine = this.findViewById(R.id.bNine);
        this.bSero = this.findViewById(R.id.bSero);
        this.bEquals = this.findViewById(R.id.bEquals);
        this.bPlus = this.findViewById(R.id.bPlus);
        this.bMinus = this.findViewById(R.id.bMinus);
        this.bMultyply = this.findViewById(R.id.bMultiply);
        this.bDivide = this.findViewById(R.id.bDivide);
        this.bEarse = this.findViewById(R.id.bEarse);

        this.bEarse.setOnClickListener(this);
        this.bDivide.setOnClickListener(this);
        this.bMultyply.setOnClickListener(this);
        this.bMinus.setOnClickListener(this);
        this.bPlus.setOnClickListener(this);
        this.bEquals.setOnClickListener(this);
        this.bSero.setOnClickListener(this);
        this.bNine.setOnClickListener(this);
        this.bEight.setOnClickListener(this);
        this.bSeven.setOnClickListener(this);
        this.bSix.setOnClickListener(this);
        this.bFive.setOnClickListener(this);
        this.bFour.setOnClickListener(this);
        this.bThree.setOnClickListener(this);
        this.bTwo.setOnClickListener(this);
        this.bOne.setOnClickListener(this);

        this.tvNumber1 = this.findViewById(R.id.tvNumber1);
        this.tvNumber2 = this.findViewById(R.id.tvNumber2);
        this.tvEqual = this.findViewById(R.id.tvEqual);
        this.tvOperator = this.findViewById(R.id.tvOperator);
        this.tvResult = this.findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View v) {
        Button clicked = (Button) v;


        if (clicked.getId() == this.bSero.getId()) {

            number2 = number2 * 10 + 0;
            this.tvNumber2.setText(number2.toString());
        }
        if (clicked.getId() == this.bOne.getId()) {

            number2 = number2 * 10 + 1;
            this.tvNumber2.setText(number2.toString());
        }
        if (clicked.getId() == this.bTwo.getId()) {

            number2 = number2 * 10 + 2;
            this.tvNumber2.setText(number2.toString());
        }
        if (clicked.getId() == this.bThree.getId()) {

            number2 = number2 * 10 + 3;
            this.tvNumber2.setText(number2.toString());
        }
        if (clicked.getId() == this.bFour.getId()) {

            number2 = number2 * 10 + 4;
            this.tvNumber2.setText(number2.toString());
        }
        if (clicked.getId() == this.bFive.getId()) {

            number2 = number2 * 10 + 5;
            this.tvNumber2.setText(number2.toString());
        }
        if (clicked.getId() == this.bSix.getId()) {

            number2 = number2 * 10 + 6;
            this.tvNumber2.setText(number2.toString());
        }
        if (clicked.getId() == this.bSeven.getId()) {

            number2 = number2 * 10 + 7;
            this.tvNumber2.setText(number2.toString());
        }
        if (clicked.getId() == this.bEight.getId()) {

            number2 = number2 * 10 + 8;
            this.tvNumber2.setText(number2.toString());
        }
        if (clicked.getId() == this.bNine.getId()) {

            number2 = number2 * 10 + 9;
            this.tvNumber2.setText(number2.toString());
        }

        if (clicked.getId() == this.bPlus.getId()) {
            number1 = number2;
            number2 = 0.0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            tvNumber2.setText(number2.toString());

            operator = 1;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("+");
        }
        if (clicked.getId() == this.bMinus.getId()) {
            number1 = number2;
            number2 = 0.0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            tvNumber2.setText(number2.toString());

            operator = 2;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("-");
        }
        if (clicked.getId() == this.bMultyply.getId()) {
            number1 = number2;
            number2 = 0.0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            tvNumber2.setText(number2.toString());

            operator = 3;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("*");
        }
        if (clicked.getId() == this.bDivide.getId()) {
            number1 = number2;
            number2 = 0.0;
            tvNumber1.setText(number1.toString());
            tvNumber1.setVisibility(View.VISIBLE);

            tvNumber2.setText(number2.toString());

            operator = 4;
            tvOperator.setVisibility(View.VISIBLE);
            tvOperator.setText("/");
        }
        if (clicked.getId() == this.bEquals.getId()) {
            switch(operator){
                case 1:
                    result = number1 + number2;
                    tvResult.setText(result.toString());
                    tvResult.setVisibility(View.VISIBLE);
                    tvEqual.setVisibility(View.VISIBLE);
                    operator=0;
                    break;
                case 2:
                    result = number1 - number2;
                    tvResult.setText(result.toString());
                    tvResult.setVisibility(View.VISIBLE);
                    tvEqual.setVisibility(View.VISIBLE);
                    operator=0;
                    break;
                case 3:
                    result = number1 * number2;
                    tvResult.setText(result.toString());
                    tvResult.setVisibility(View.VISIBLE);
                    tvEqual.setVisibility(View.VISIBLE);
                    operator=0;
                    break;
                case 4:
                    result = number1 / number2;
                    tvResult.setText(result.toString());
                    tvResult.setVisibility(View.VISIBLE);
                    tvEqual.setVisibility(View.VISIBLE);
                    operator=0;
                    break;
            }
        }
        if (clicked.getId() == this.bEarse.getId()) {

            tvResult.setVisibility(View.GONE);
            tvNumber1.setVisibility(View.GONE);
            tvNumber2.setText("");
            tvEqual.setVisibility(View.GONE);
            tvOperator.setVisibility(View.GONE);
            number2 = 0.0;
            number1 = 0.0;
            operator = 0;

        }
    }
    public String toString(){
        String calculation;
        calculation = number1.toString() + " " + operator.toString() + " " + number2.toString() + " = " + result.toString();
    }

    private String operatorToString(){
        switch (operator){
            case 1:
                return "+";
            case 2:
                return "-";
            case 3:
                return "*";
            case 4:
                return "/";
            default:
                return "";
        }
    }
}