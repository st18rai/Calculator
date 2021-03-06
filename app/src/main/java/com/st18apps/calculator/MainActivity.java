package com.st18apps.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button buttonPlus;
    private Button buttonC;
    private Button buttonCalculate;

    private String tempOld;
    private String tempNew;
    private int res;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonCalculate = (Button) findViewById(R.id.buttonCalc);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button1:
                textView.setText(textView.getText() + getString(R.string.number_1));
                break;
            case R.id.button2:
                textView.setText(textView.getText() + getString(R.string.number_2));
                break;
            case R.id.button3:
                textView.setText(textView.getText() + getString(R.string.number_3));
                break;
            case R.id.button4:
                textView.setText(textView.getText() + getString(R.string.number_4));
                break;
            case R.id.button5:
                textView.setText(textView.getText() + getString(R.string.number_5));
                break;
            case R.id.button6:
                textView.setText(textView.getText() + getString(R.string.number_6));
                break;
            case R.id.buttonPlus:
                tempOld = textView.getText().toString();
                textView.setText("");
                break;
            case R.id.buttonC:
                textView.setText("");
                break;
            case R.id.buttonCalc:
                tempNew = textView.getText().toString();
                res = Integer.parseInt(tempOld) + Integer.parseInt(tempNew);
                textView.setText(String.valueOf(res));
                break;
        }
    }
}
