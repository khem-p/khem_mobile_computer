package com.mrlv.app4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button buttonAdd, buttonSub, buttonMul, buttonDiv, buttonReset;
    TextView testResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDivision);
        buttonReset = findViewById(R.id.buttonReset);
        testResult = findViewById(R.id.testResult);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('+');
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('-');
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('*');
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate('/');
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");
                testResult.setText(getString(R.string.result_label));
            }
        });
    }

    private void calculate(char operator) {
        String num1Str = editText1.getText().toString().trim();
        String num2Str = editText2.getText().toString().trim();

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            testResult.setText(getString(R.string.err_enter_numbers));
            return;
        }

        try {
            double n1 = Double.parseDouble(num1Str);
            double n2 = Double.parseDouble(num2Str);
            double result = 0;
            boolean error = false;

            switch (operator) {
                case '+': result = n1 + n2; break;
                case '-': result = n1 - n2; break;
                case '*': result = n1 * n2; break;
                case '/':
                    if (n2 == 0) {
                        testResult.setText(getString(R.string.err_div_zero));
                        error = true;
                    } else {
                        result = n1 / n2;
                    }
                    break;
            }

            if (!error) {
                testResult.setText(getString(R.string.result_label) + result);
            }
        } catch (NumberFormatException e) {
            testResult.setText(getString(R.string.err_invalid_input));
        }
    }
}
