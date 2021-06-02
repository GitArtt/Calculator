package com.example.calculator.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.calculator.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_grid_layout);

        initView();
    }

    private void initView() {
        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);
        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnPlus = findViewById(R.id.btnPlus);
        Button btnPercent = findViewById(R.id.btnPercent);
        Button btnAC = findViewById(R.id.btnAC);
        Button btnCE = findViewById(R.id.btnCE);
        Button btnSplit = findViewById(R.id.btnSplit);
        Button btnMultiply = findViewById(R.id.btnMultiply);
        Button btnDot = findViewById(R.id.btnDot);
        Button btnEqual = findViewById(R.id.btnEqual);
        Button[] buttons = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnMinus,
                btnPlus, btnPercent, btnAC, btnCE, btnSplit, btnMultiply, btnDot, btnEqual};
        for (Button btn: buttons) {
            btn.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn0) {

        }
        if (v.getId() == R.id.btn1) {

        }
        if (v.getId() == R.id.btn2) {

        }
        if (v.getId() == R.id.btn3) {

        }
        if (v.getId() == R.id.btn4) {

        }
        if (v.getId() == R.id.btn5) {

        }
        if (v.getId() == R.id.btn6) {

        }
        if (v.getId() == R.id.btn7) {

        }
        if (v.getId() == R.id.btn8) {

        }
        if (v.getId() == R.id.btn9) {

        }
        if (v.getId() == R.id.btnMinus) {

        }
        if (v.getId() == R.id.btnPlus) {

        }
        if (v.getId() == R.id.btnPercent) {

        }
        if (v.getId() == R.id.btnAC) {

        }
        if (v.getId() == R.id.btnCE) {

        }
        if (v.getId() == R.id.btnSplit) {

        }
        if (v.getId() == R.id.btnMultiply) {

        }
        if (v.getId() == R.id.btnEqual) {

        }
    }

    private void addText(char c) {

    }
}