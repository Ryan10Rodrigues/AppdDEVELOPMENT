package com.example.appdevelopment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    Button addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        result = (TextView) findViewById(R.id.result);

        addition = (Button) findViewById(R.id.buttonAddition);
        subtraction = (Button) findViewById(R.id.buttonSubtraction);
        multiplication = (Button) findViewById(R.id.buttonMultiplication);
        division = (Button) findViewById(R.id.buttonDivision);


        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1.getText() != null && num2.getText() != null) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double res = n1 + n2;
                    result.setText(String.valueOf(res));

                } else {
                    Toast.makeText(view.getContext(), "Please enter the numbers properly", Toast.LENGTH_SHORT).show();
                }

            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1.getText() != null && num2.getText() != null) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double res = n1 - n2;
                    result.setText(String.valueOf(res));

                } else {
                    Toast.makeText(view.getContext(), "Please enter the numbers properly", Toast.LENGTH_SHORT).show();
                }

            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1.getText() != null && num2.getText() != null) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double res = n1 * n2;
                    result.setText(String.valueOf(res));

                } else {
                    Toast.makeText(view.getContext(), "Please enter the numbers properly", Toast.LENGTH_SHORT).show();
                }

            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (num1.getText() != null && num2.getText() != null) {
                    double n1 = Double.parseDouble(num1.getText().toString());
                    double n2 = Double.parseDouble(num2.getText().toString());

                    double res = n1 / n2;
                    result.setText(String.valueOf(res));

                } else {
                    Toast.makeText(view.getContext(), "Please enter the numbers properly", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}