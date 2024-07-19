package com.example.myapplication;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Access views using binding
        binding.loanAmountInput.setText("5000");
        binding.calculateButton.setOnClickListener(v -> {
            Locale locale = Locale.US;
            int loanAmount = Integer.parseInt(binding.loanAmountInput.getText().toString());
            int loanDuration = Integer.parseInt((binding.loanDurationInput.getText().toString())) * 12 + Integer.parseInt(binding.loanTermInMonthsInput.getText().toString());
            double loanInterestRate = Double.parseDouble(binding.interestRateInput.getText().toString()) / 100;
            double loanNumerator = loanAmount * (loanInterestRate / 12) * Math.pow((1 + loanInterestRate/12), loanDuration);
            double loanDenumerator = Math.pow(1+loanInterestRate/12, loanDuration) - 1;
            double emi = loanNumerator / loanDenumerator;
            String monthlyPayment = String.format(locale,"%.2f", loanNumerator/loanDenumerator);
            binding.monthlyPaymentAmount.setText(monthlyPayment);
            double principal = emi * (Math.pow((1 + loanInterestRate / 12), loanDuration) - 1)
                            / (Math.pow(1+loanInterestRate/12, loanDuration))
                            / (loanInterestRate/12);
            double totalPayed = emi * loanDuration;
            binding.totalAmount.setText(String.format(locale,"%.2f", totalPayed));
            binding.totalInterestAmount.setText(String.format(locale,"%.2f", totalPayed - principal));

        });
    }

}
