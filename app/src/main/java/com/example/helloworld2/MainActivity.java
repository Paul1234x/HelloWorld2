package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//hallo erster comment
public class MainActivity extends AppCompatActivity {
    private Button bOne;
    private Button bTwo;
    private Button bThree;
    private Button bFour;
    private Button bFive;
    private Button bSix;
    private Button bSeven;
    private Button bEight;
    private Button bNine;
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

        this.bEight.setOnClickListener(this);
        this.bSeven.setOnClickListener(this);
        this.bSix.setOnClickListener(this);
        this.bFive.setOnClickListener(this);
        this.bFour.setOnClickListener(this);
        this.bThree.setOnClickListener(this);
        this.bTwo.setOnClickListener(this);
        this.bOne.setOnClickListener(this);
    }




    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bNine = this.findViewById(R.id.bNine);

        this.bNine.setOnClickListener(this);

    }
    private Button bSero;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bSero = this.findViewById(R.id.bSero);

        this.bSero.setOnClickListener(this);
    }
    private Button bEquals;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bEquals = this.findViewById(R.id.bEquals);

        this.bEquals.setOnClickListener(this);
    }
    private Button bPlus;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bPlus = this.findViewById(R.id.bPlus);

        this.bPlus.setOnClickListener(this);
    }
    private Button bMinus;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bMinus = this.findViewById(R.id.bMinus);

        this.bMinus.setOnClickListener(this);
    }
    private Button bMultyply;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bMultyply = this.findViewById(R.id.bMultiply);

        this.bMultyply.setOnClickListener(this);
    }
    private Button bDivide;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bDivide = this.findViewById(R.id.bDivide);

        this.bDivide.setOnClickListener(this);
    }
    private Button bEarse;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bEarse = this.findViewById(R.id.bEarse);

        this.bEarse.setOnClickListener(this);
    }

}