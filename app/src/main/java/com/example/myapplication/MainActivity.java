package com.example.myapplication;

import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText loanAmountInput;
    private EditText interestRateInput;
    private EditText loanTermInput;
    private Button calculateButton;
    private TextView resultOutput;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout vertLayout = new LinearLayout(this);
        vertLayout.setOrientation(LinearLayout.VERTICAL);
        vertLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        vertLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        int vertPadding = 16;
        vertLayout.setPadding(vertPadding, vertPadding, vertPadding, vertPadding);

        LinearLayout horLayout = new LinearLayout(this);
        horLayout.setOrientation(LinearLayout.VERTICAL);
        horLayout.setGravity(Gravity.CENTER_HORIZONTAL);
        horLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        int horPadding = 8;
        horLayout.setPadding(horPadding, horPadding, horPadding, horPadding);

        LinearLayout horInput = new LinearLayout(this);
        horInput.setOrientation(LinearLayout.VERTICAL);
        horInput.setGravity(Gravity.CENTER_HORIZONTAL);
        horInput.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
        ));
        int horInputPadding = 8;
        horLayout.setPadding(horInputPadding, horInputPadding, horInputPadding, horInputPadding);
        vertLayout.addView(horInput);

        TextView loanAmountLabel = new TextView(this);
        loanAmountLabel.setText("Loan amound: ");
        loanAmountLabel.setTextSize(18);
        loanAmountLabel.setPadding(0, horPadding, 0, 0);
        vertLayout.addView(loanAmountLabel);

        TextView loanDurationLabel = new TextView(this);
        loanAmountLabel.setText("Loan term in years: ");
        loanAmountLabel.setTextSize(18);
        loanAmountLabel.setPadding(0, horPadding, 0, 0);
        vertLayout.addView(loanDurationLabel);

        TextView loanDepositLabel = new TextView(this);
        loanAmountLabel.setText("Initial deposit: ");
        loanAmountLabel.setTextSize(18);
        loanAmountLabel.setPadding(0, horPadding, 0, 0);
        vertLayout.addView(loanDepositLabel);

        TextView loanInterestLabel = new TextView(this);
        loanAmountLabel.setText("Annual interes rate: ");
        loanAmountLabel.setTextSize(18);
        loanAmountLabel.setPadding(0, horPadding, 0, 0);
        vertLayout.addView(loanInterestLabel);

        setContentView(vertLayout);

    }

}
