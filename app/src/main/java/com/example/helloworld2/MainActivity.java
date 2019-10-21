package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

//hallo erster comment
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
private Button bOne;
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    this.bOne = this.findViewById(R.id.bOne);

    this.bOne.setOnClickListener(this);

}
private Button bTwo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bTwo = this.findViewById(R.id.bTwo);

        this.bTwo.setOnClickListener(this);

    }
    private Button bThree;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bThree = this.findViewById(R.id.bThree);

        this.bThree.setOnClickListener(this);

    }
    private Button bFour;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bFour = this.findViewById(R.id.bFour);

        this.bFour.setOnClickListener(this);

    }