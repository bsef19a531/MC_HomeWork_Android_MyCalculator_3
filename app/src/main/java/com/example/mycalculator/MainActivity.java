package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class MainActivity extends AppCompatActivity {

//    double firstParam, secondParam;
//    private TextView calculatePanel = findViewById(R.id.calculatorPanel);
    private final static int LIMIT = 31;
//    private Boolean decimalPlacer = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pressBtn0(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "0";
            calculatePanel.setText(str);
        }
    }

    public void pressBtn1(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "1";
            calculatePanel.setText(str);
        }
    }

    public void pressBtnDot(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {

            str+= ".";
            calculatePanel.setText(str);
        }
    }

    public void pressBtn2(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "2";
            calculatePanel.setText(str);
        }
    }

    public void pressBtn3(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "3";
            calculatePanel.setText(str);
        }
    }

    public void pressBtn4(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "4";
            calculatePanel.setText(str);
        }
    }

    public void pressBtn5(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
        str+= "5";
        calculatePanel.setText(str);
        }
    }

    public void pressBtn6(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "6";
            calculatePanel.setText(str);
        }
    }

    public void pressBtn7(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "7";
            calculatePanel.setText(str);
        }
    }

    public void pressBtn8(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "8";
            calculatePanel.setText(str);
        }
    }

    public void pressBtn9(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "9";
            calculatePanel.setText(str);
        }
    }

    public void pressBtnDelete(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(!(str.equals(""))) {
            str = str.substring(0, str.length() - 1);
            calculatePanel.setText(str);
        }
    }

    public void pressBtnClear(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        calculatePanel.setText("");
    }

    public void pressBtnMod(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "%";
            calculatePanel.setText(str);

        }

    }

    public void pressBtnDivide(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "÷";
            calculatePanel.setText(str);


        }

    }

    public void pressBtnMultiply(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "×";
            calculatePanel.setText(str);

        }

    }

    public void pressBtnSubtract(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "-";
            calculatePanel.setText(str);

        }

    }

    public void pressBtnAddition(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() < LIMIT) {
            str += "+";
            calculatePanel.setText(str);

        }

    }

    public void pressBtnEquals(View v)
    {
        TextView calculatePanel = findViewById(R.id.calculatorPanel);
        String str = calculatePanel.getText().toString();
        if(str.length() == 0)
        {
            Toast.makeText(MainActivity.this,"Nothing to Calculate",Toast.LENGTH_SHORT).show();
        }
        else
        {
            stringCalculation(str);
        }
    }

    private void stringCalculation(String str)
    {
        try {
               str = str.replaceAll("÷", "/");
            str = str.replaceAll("×", "*");
               Expression exp = new ExpressionBuilder(str).build();
               //double result = exp.evaluate();
               TextView calculatePanel = findViewById(R.id.calculatorPanel);
               calculatePanel.setText(exp.evaluate()+"");

        }
        catch(ArithmeticException e)
        {
            Toast.makeText(MainActivity.this,"Math Error",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(MainActivity.this,"Syntax Error: Invalid Expression",Toast.LENGTH_SHORT).show();
        }
    }


}