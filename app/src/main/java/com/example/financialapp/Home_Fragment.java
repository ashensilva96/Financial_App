package com.example.financialapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Home_Fragment extends Fragment implements View.OnClickListener {

    private CardView incomeCardView, expensessCardView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_, container, false);
        incomeCardView = (CardView) view.findViewById(R.id.CD_Income);
        expensessCardView = (CardView) view.findViewById(R.id.CD_Expenses);

        incomeCardView.setOnClickListener(this);
        expensessCardView.setOnClickListener(this);

        incomeCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), IncomeActivity.class);
                startActivity(i);
            }
        });

        expensessCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), ExpenseActivity.class);
                startActivity(i);
            }
        });

        return view;
    }


    @Override
    public void onClick(View v) {

    }
}