package com.example.helloworld2;

import android.view.View;

public class Calculation {
    private Integer operator; //1 für +, 2 für -, 3 für *, 4 für /
    private Double number1;
    private Double number2;
    private Double result;

    public Calculation(Double number1, Double number2, Integer operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.caclulate();

    }

    public Calculation(Double number1, Double number2, Integer operator, Double result) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
        this.result = result;
    }

    public Integer getOperator() {
        return this.operator;
    }

    public Double getNumber1() {
        return this.number1;
    }

    public Double getNumber2() {
        return this.number2;
    }

    public Double getResult() {
        return this.result;
    }


    public void setOperator(Integer op) {
        this.operator = op;
    }

    public void setNumber1(Double n1) {
        this.number1 = n1;
    }

    public void setNumber2(Double n2) {
        this.number2 = n2;
    }

    public void setResult(Double res) {
        this.result = res;
    }

    public void caclulate() {
        switch (operator) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            case 4:
                result = number1 / number2;
                break;
        }
    }
}
