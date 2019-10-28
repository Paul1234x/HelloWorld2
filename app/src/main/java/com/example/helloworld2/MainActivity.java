package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//hallo erster comment
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
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
        this.tvResult= this.findViewById(R.id.tvResult);
    }

    @Override
    public void onClick(View view) {

    }
}